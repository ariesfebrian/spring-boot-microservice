FROM openjdk:11
ADD target/passenger-service-0.0.1-SNAPSHOT.jar passenger-service-0.0.1-SNAPSHOT.jar
EXPOSE 8200
ENTRYPOINT ["java", "-jar", "passenger-service-0.0.1-SNAPSHOT.jar"]