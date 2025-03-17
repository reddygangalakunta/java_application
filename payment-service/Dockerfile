# Payment Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/payment-service.jar /app/payment-service.jar
ENTRYPOINT ["java", "-jar", "/app/payment-service.jar"]