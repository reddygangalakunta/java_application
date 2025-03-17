# Order Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/order-service.jar /app/order-service.jar
ENTRYPOINT ["java", "-jar", "/app/order-service.jar"]