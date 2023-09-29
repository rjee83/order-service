FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/order-service.jar order-service.jar
ENTRYPOINT ["java","-jar","/order-service.jar"]