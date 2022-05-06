FROM openjdk:11
ADD target/database-input-0.0.1-SNAPSHOT.jar database-input.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/database-input.jar"]