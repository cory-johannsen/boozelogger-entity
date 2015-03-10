# boozelogger-entity

This is a data management system for fermentation projects.  It is built on spring-boot, spring-data-jpa, 
and spring-data-rest.  Gradle is the build system, using the gradle wrapper.

# Setup
1. Postgres - The application is built against PostGres 9.4, but any recent version should work.
2. Database - the database name is boozelogger by default.  The default user name is boozelogger, 
password boozelogger.  Edit src/main/resources/META-INF/persistence.xml to change these values if your 
environment is different.
3. Schema - src/main/sql/boozelogger.sql contains the database schema.  Load it into postgres.
4. The service can be run via the gradle wrapper.  The service will by default run on port 9000: 

> ./gradlew bootRun 

5. Each entity repository interface generates a HATEOS compliant endpoint.  A GET at the root will return a list of all publish endpoints:

> curl http://localhost:9000/

{
  "_links" : {
    "ferment" : {
      "href" : "http://localhost:9000/ferment{?page,size,sort}",
      "templated" : true
    },
    "recipeComponent" : {
      "href" : "http://localhost:9000/recipeComponent{?page,size,sort}",
      "templated" : true
    },
    "process" : {
      "href" : "http://localhost:9000/process{?page,size,sort}",
      "templated" : true
    },
    "vessel" : {
      "href" : "http://localhost:9000/vessel{?page,size,sort}",
      "templated" : true
    },
    "processStep" : {
      "href" : "http://localhost:9000/processStep{?page,size,sort}",
      "templated" : true
    },
    "ingredient" : {
      "href" : "http://localhost:9000/ingredient{?page,size,sort}",
      "templated" : true
    },
    "recipe" : {
      "href" : "http://localhost:9000/recipe{?page,size,sort}",
      "templated" : true
    },
    "fermentLogEntry" : {
      "href" : "http://localhost:9000/fermentLogEnty{?page,size,sort}",
      "templated" : true
    },
    "fermentLog" : {
      "href" : "http://localhost:9000/fermentLog{?page,size,sort}",
      "templated" : true
    },
    "distillation" : {
      "href" : "http://localhost:9000/distillation{?page,size,sort}",
      "templated" : true
    },
    "finishLogEntry" : {
      "href" : "http://localhost:9000/finishLogEntry{?page,size,sort}",
      "templated" : true
    },
    "finishLog" : {
      "href" : "http://localhost:9000/finishLog{?page,size,sort}",
      "templated" : true
    },
    "finish" : {
      "href" : "http://localhost:9000/finish{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:9000/alps"
    }
  }
}

6. Fetching the path for a type will provide the repository interface:

>> curl http://localhost:9000/ingredient                                                                          
{
  "_links" : {
    "self" : {
      "href" : "http://localhost:9000/ingredient{?page,size,sort}",
      "templated" : true
    },
    "search" : {
      "href" : "http://localhost:9000/ingredient/search"
    }
  },
  "page" : {
    "size" : 20,
    "totalElements" : 0,
    "totalPages" : 0,
    "number" : 0
  }
}

7. POSTing to this endpoint will create a record and store it in the database:

>  curl -i -X POST -H "Content-Type:application/json" -d '{  "name" : "2-Row Scottish Malt" }' http://localhost:9000/ingredient 
HTTP/1.1 201 Created
Server: Apache-Coyote/1.1
X-Application-Context: application:9000
Location: http://localhost:9000/ingredient/1
Content-Length: 0
Date: Tue, 10 Mar 2015 17:49:17 GMT

8. Fetching the index returned from the creation returns the new item:

>  curl http://localhost:9000/ingredient/1                                                                         
{
  "name" : "2-Row Scottish Malt",
  "createdAt" : "2015-03-10T17:49:17.142+0000",
  "_links" : {
    "self" : {
      "href" : "http://localhost:9000/ingredient/1"
    }
  }
}

9. Fetching the ingredient repository will now include the new ingredient:

> curl http://localhost:9000/ingredient/                                                                           
{
  "_links" : {
    "self" : {
      "href" : "http://localhost:9000/ingredient{?page,size,sort}",
      "templated" : true
    },
    "search" : {
      "href" : "http://localhost:9000/ingredient/search"
    }
  },
  "_embedded" : {
    "ingredient" : [ {
      "name" : "2-Row Scottish Malt",
      "createdAt" : "2015-03-10T17:49:17.142+0000",
      "_links" : {
        "self" : {
          "href" : "http://localhost:9000/ingredient/1"
        }
      }
    } ]
  },
  "page" : {
    "size" : 20,
    "totalElements" : 1,
    "totalPages" : 1,
    "number" : 0
  }
}

8. Fetching the search interface will expose any custom finders:

> curl http://localhost:9000/ingredient/search                                                                     
{
  "_links" : {
    "findByName" : {
      "href" : "http://localhost:9000/ingredient/search/findByName{?name}",
      "templated" : true
    }
  }
}

9. A custom finder can be invoked using the templated search parameters:

> http://localhost:9000/ingredient/search/findByName?name="2-Row Scottish Malt"
