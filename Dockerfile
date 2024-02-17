FROM eclipse-temurin:17
COPY target/webdevops.jar webdevops.jar
CMD ["java","-jar","webdevops.jar"]