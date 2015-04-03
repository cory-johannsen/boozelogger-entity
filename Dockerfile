FROM quay.io/porch/java8:latest

MAINTAINER Cory Johannsen <cory.a.johannsen@gmail.com>

EXPOSE 9000 22

RUN     mkdir -p /data/app/newrelic/logs

ADD	    build/libs/boozelogger-entity-0.1.0.jar /data/app/boozelogger-entity.jar
ADD     conf/newrelic.yml /data/app/
ADD     newrelic/newrelic-api.jar /data/app/
ADD     newrelic/newrelic.jar /data/app/
ADD     newrelic/extension.xsd /data/app/
ADD     newrelic/nrcerts /data/app/
ADD	    application.yml /data/app/application.yml
ADD	    docker_start.sh /data/app/start.sh

CMD	    cd /data/app && /data/app/start.sh
