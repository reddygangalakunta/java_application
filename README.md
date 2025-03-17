# Microservices Java Application

This repository contains a basic structure for a microservices Java application with six microservices, a Jenkinsfile for CI/CD pipeline, and Dockerfiles for each microservice.

## Microservices

1. User Service
2. Product Service
3. Order Service
4. Payment Service
5. Inventory Service
6. Notification Service

## Structure

```
microservices-java-application/
├── user-service/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── product-service/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── order-service/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── payment-service/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── inventory-service/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── notification-service/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
└── Jenkinsfile
```

## Prerequisites

- Docker
- Docker Compose (optional, if you want to use docker-compose to run all services together)
- Maven (for building the Java applications)

## Build and Run Locally

### Using Docker

1. Navigate to each microservice directory and build the Docker image:

```sh
cd user-service
mvn clean package
docker build -t user-service .

cd ../product-service
mvn clean package
docker build -t product-service .

cd ../order-service
mvn clean package
docker build -t order-service .

cd ../payment-service
mvn clean package
docker build -t payment-service .

cd ../inventory-service
mvn clean package
docker build -t inventory-service .

cd ../notification-service
mvn clean package
docker build -t notification-service .
```

2. Run the Docker containers:

```sh
docker run -d --name user-service -p 8081:8080 user-service
docker run -d --name product-service -p 8082:8080 product-service
docker run -d --name order-service -p 8083:8080 order-service
docker run -d --name payment-service -p 8084:8080 payment-service
docker run -d --name inventory-service -p 8085:8080 inventory-service
docker run -d --name notification-service -p 8086:8080 notification-service
```

### Using Docker Compose

1. Create a `docker-compose.yml` file in the root directory:

```yml
version: '3'
services:
  user-service:
    build: ./user-service
    ports:
      - "8081:8080"
  product-service:
    build: ./product-service
    ports:
      - "8082:8080"
  order-service:
    build: ./order-service
    ports:
      - "8083:8080"
  payment-service:
    build: ./payment-service
    ports:
      - "8084:8080"
  inventory-service:
    build: ./inventory-service
    ports:
      - "8085:8080"
  notification-service:
    build: ./notification-service
    ports:
      - "8086:8080"
```

2. Build and run all services together:

```sh
docker-compose up --build
```

## Jenkins Pipeline

The Jenkinsfile includes stages for building, testing, and deploying the microservices. You can set up a Jenkins pipeline by using this Jenkinsfile.

## Dockerfiles

Each microservice has its own Dockerfile for containerization. Below are the Dockerfiles for each service:

### User Service Dockerfile

```dockerfile
# User Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/user-service.jar /app/user-service.jar
ENTRYPOINT ["java", "-jar", "/app/user-service.jar"]
```

### Product Service Dockerfile

```dockerfile
# Product Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/product-service.jar /app/product-service.jar
ENTRYPOINT ["java", "-jar", "/app/product-service.jar"]
```

### Order Service Dockerfile

```dockerfile
# Order Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/order-service.jar /app/order-service.jar
ENTRYPOINT ["java", "-jar", "/app/order-service.jar"]
```

### Payment Service Dockerfile

```dockerfile
# Payment Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/payment-service.jar /app/payment-service.jar
ENTRYPOINT ["java", "-jar", "/app/payment-service.jar"]
```

### Inventory Service Dockerfile

```dockerfile
# Inventory Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/inventory-service.jar /app/inventory-service.jar
ENTRYPOINT ["java", "-jar", "/app/inventory-service.jar"]
```

### Notification Service Dockerfile

```dockerfile
# Notification Service Dockerfile
FROM openjdk:11-jre-slim
COPY target/notification-service.jar /app/notification-service.jar
ENTRYPOINT ["java", "-jar", "/app/notification-service.jar"]
```