# User Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/user-service.jar /app/user-service.jar
ENTRYPOINT ["java", "-jar", "/app/user-service.jar"]