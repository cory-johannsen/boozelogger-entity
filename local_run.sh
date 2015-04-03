#!/bin/sh
IMAGE=quay.io/cory_johannsen/boozelogger-entity:latest
CONTAINER=boozelogger-entity

if [ -z "$SPRING_PROFILE" ]
then
    SPRING_PROFILE=dev-docker
fi

if [ -z "$DOCKER_HOST" ]
then
    DOCKER_HOST=127.0.0.1:2375
fi

echo "Starting boozelogger-entity service on docker host $DOCKER_HOST using environment $SPRING_PROFILE"

docker -H $DOCKER_HOST stop $CONTAINER
docker -H $DOCKER_HOST rm $CONTAINER
docker -H $DOCKER_HOST run --user nobody -P -e "SPRING_PROFILE=$SPRING_PROFILE" -t -i -p :9000:9000 --name $CONTAINER --link boozelogger-db:postgres $IMAGE $1
