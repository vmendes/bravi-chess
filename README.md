
## Bravi Code Challenge

Given a knight located on a coordinate chosen by the user find out all possible locations where the knight can move in 2 turns.
For that, here's the web application and an API.

## Requirements

1. Java - 1.8.x
2. Maven - 3.x.x
3. NodeJS 8.x

## Steps to Setup - API

**. Build and run the app using maven**

```bash
cd bravi-chess-api
mvn package
java -jar target/bravi-chess-api.jar
```

Alternatively, you can run the app directly without packaging it like so -

```bash
mvn spring-boot:run
```

## Steps to Setup - Web

**. Build and run the app using maven**

```bash
cd bravi-chess-web
npm install -g @angular/cli
npm install
ng serve
```
