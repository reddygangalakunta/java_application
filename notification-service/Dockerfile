# Notification Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/notification-service.jar /app/notification-service.jar
ENTRYPOINT ["java", "-jar", "/app/notification-service.jar"]