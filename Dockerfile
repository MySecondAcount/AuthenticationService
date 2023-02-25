FROM openjdk:11
WORKDIR /app
COPY target/AuthenticationService.jar /app
EXPOSE 8080
CMD ["java", "-jar", "/app/AuthenticationService.jar"]