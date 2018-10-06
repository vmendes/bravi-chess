
## Bravi Code Challenge

Given a knight located on a coordinate chosen by the user find out all possible locations where the knight can move in 2 turns.
For that, here's the web application and an API.

## Requirements

1. Java - 1.8.x
2. Maven - 3.x.x
3. NodeJS 8.x

## Steps to Setup - API

**1. Build and run the app using Java/Maven**

```bash
cd bravi-chess-api
mvn package
java -jar target/bravi-chess-api.jar
```

Alternatively, you can run the app directly using Maven 

```bash
mvn spring-boot:run
```

**2. Check current endpoints with URL below**
```bash
http://localhost:8888/swagger-ui.html
```

## Steps to Setup - Web

**1. Build and run the app using Node**

```bash
cd bravi-chess-web
npm install -g @angular/cli
npm install
ng serve
```

**2. Open your browser on**
```bash
http://localhost:4200/
```

## Steps to run on Docker

**1. Build API first**

```bash
cd bravi-chess-api
mvn package
```

**2. Run docker compose**
```bash
docker-compose up --build
```
