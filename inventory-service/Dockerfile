# Inventory Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/inventory-service.jar /app/inventory-service.jar
ENTRYPOINT ["java", "-jar", "/app/inventory-service.jar"]