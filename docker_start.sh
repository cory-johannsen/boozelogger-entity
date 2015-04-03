#!/bin/bash

echo "BoozeLogger Entity API service launching with profile $SPRING_PROFILE"

java -Dspring.profiles.active=$SPRING_PROFILE -Dnewrelic.environment=$SPRING_PROFILE -Xms256m -Xmx1024m -javaagent:/data/app/newrelic.jar -jar $PWD/boozelogger-entity.jar
