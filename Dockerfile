FROM amazoncorretto:17.0.7-alpine
EXPOSE 8080
ADD build/libs/openapi-swagger-demo-3.0.0.jar  openapi-swagger-demo-3.0.0.jar
ENTRYPOINT ["java","-jar","/openapi-swagger-demo-3.0.0.jar"]