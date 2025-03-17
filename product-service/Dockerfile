# Product Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/product-service.jar /app/product-service.jar
ENTRYPOINT ["java", "-jar", "/app/product-service.jar"]