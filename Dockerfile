FROM openjdk:17
ADD target/dockerjava-creditcard-0.0.1-SNAPSHOT.jar creditcard-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "creditcard-0.0.1-SNAPSHOT.jar"]