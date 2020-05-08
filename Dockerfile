FROM openjdk:8-alpine
COPY /target/calculator-1.0-SNAPSHOT.jar calculator-1.0-SNAPSHOT.jar
CMD ["java","-cp","/calculator-1.0-SNAPSHOT.jar","Calculator"]
