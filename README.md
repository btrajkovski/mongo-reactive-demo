# mongo-reactive-demo

Project using Spring Boot with Webflux with Spring Data Mongo reactive

## How to start
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
