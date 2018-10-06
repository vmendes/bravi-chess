FROM openjdk:8-jdk-alpine
MAINTAINER Valdir Mendes <valdir.mendes@gmail.com>
RUN mkdir /tmp/app
WORKDIR /tmp/app
EXPOSE 8888
ADD target/bravi-chess-api.jar bravi-chess-api.jar
ENTRYPOINT java -jar bravi-chess-api.jar