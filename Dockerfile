FROM maven:3.9.5-openjdk-21 AS build
COPY . .
RUN mvn clean package -DskipTests

FORM openjdk:21-jdk-slim
COPY --from=build /target/Attendance2-0.0.1-SNAPSHOT.jar Attendance2.jar
EXPOSE 8080
ENTRYPOINT ["java","jar",Attendance2.jar]
