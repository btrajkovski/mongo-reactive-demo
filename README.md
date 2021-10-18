# mongo-reactive-demo

Project using Spring Boot with Webflux with Spring Data Mongo reactive

## Prerequisites
- Java
- Maven
- Docker
- Docker-compose

## How to start
- Start MongoDB with `docker-compose up -d`
- Run `main` in `MongoReactiveDemoApplication`

## Endpoints
- **POST** `/kayaks`
```
{
  "name": "Regular Kayak",
  "owner": "btrajkovski",
  "value": 100,
  "makeModel": "Decathlon"
}
```
----
- **GET** `/kayaks`
