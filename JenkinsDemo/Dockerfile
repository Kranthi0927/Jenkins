FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy the built jar into the image. The wildcard matches the re-packaged jar.
COPY target/*-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
