# boozelogger-entity

This is a data management system for fermentation projects.  It is built on spring-boot, spring-data-jpa, 
and spring-data-rest.  Gradle is the build system, using the gradle wrapper.

# Setup
1. Postgres - The application is built against PostGres 9.4, but any recent version should work.
2. Database - the database name is boozelogger by default.  The default user name is boozelogger, 
password boozelogger.  Edit src/main/resources/META-INF/persistence.xml to change these values if your 
environment is different.
3. Schema - src/main/sql/boozelogger.sql contains the database schema.  Load it into postgres.
4. en
