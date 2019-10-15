FROM openjdk:8-jre
WORKDIR /app/postgis-query-places
COPY build/libs/*.jar /app/postgis-query-places/QueryPlaces-0.0.1-SNAPSHOT.jar
CMD   ["sh", "-c", "java ${JAVA_OPTS}  -jar /app/postgis-query-places/QueryPlaces-0.0.1-SNAPSHOT.jar"]
