FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ./target/spring-boot-docker-step-1.jar  app.jar
ENTRYPOINT ["java","-jar","/app.jar"]