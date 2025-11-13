FROM maven:3.9.6-eclipse-temurin-17 AS build


WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline


COPY src /app/src


RUN mvn clean package -DskipTests


FROM eclipse-temurin:17-jre-jammy


WORKDIR /app


EXPOSE 8081


COPY --from=build /app/target/gs-6-gamified-teams.jar .


ENTRYPOINT ["java", "-jar", "gs-6-gamified-teams.jar"]