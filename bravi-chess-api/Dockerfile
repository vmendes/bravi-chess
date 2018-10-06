FROM openjdk:8-jdk-alpine
MAINTAINER Valdir Mendes <valdir.mendes@gmail.com>
VOLUME /tmp
EXPOSE 8888
ARG JAR_FILE=target/bravi-chess-api.jar
ADD ${JAR_FILE} bravi-chess-api.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bravi-chess-api.jar"]