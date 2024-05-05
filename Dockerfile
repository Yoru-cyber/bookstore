FROM openjdk:17-jdk-alpine

EXPOSE 8080

RUN mkdir -p /app/

ADD build/libs/bookstore-0.0.1-SNAPSHOT.jar /app/bookstore-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/app/bookstore-0.0.1-SNAPSHOT.jar"]