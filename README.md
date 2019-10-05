# Places search API with Spring  Boot, Spring Data JPA, PostgresSQL and Docker

## Prerequisites
- JDK 1.7 or later
- Gradle 3 or later
- Postgres server/Docker Image for Postgres and postgis and docker

## Guide
[Docker setup for Postgres](https://hub.docker.com/r/kartoza/postgis)

##Default Configurations 
- tomcat port: 9090 
- java version 1.8

## Stack
- Spring Boot
- Spring Data JPA
- Gradle
- PostgresSQL

## Run
```./gradlew clean build```

##  postgres & postgis installation

```brew install postgres```

```brew install postgis```

## postgres & postgis installation(Using docker)

- ```docker pull kartoza/postgis```
- docker run --name "postgis" -p 25432:5432 -d -t kartoza/postgis

## Running queries in postgres within docker conatainer

- ```docker exec -it postgis bash```

- ```psql -h localhost -p 5432 -U docker -d gis```

## Query to select all stores with in 5 Km radius

- SELECT Brand, geom,latitude,longitude ,Store_Number,facilityid FROM stores
 WHERE ST_DWithin(geom, ST_MakePoint(-122.325959,47.625138)::geography, 5000);

- SELECT  Brand, geom,latitude,longitude ,Store_Number,facilityid FROM stores
 WHERE ST_Distance_Sphere(geom,ST_MakePoint(-122.325959,47.625138)::geography ) < 5000;