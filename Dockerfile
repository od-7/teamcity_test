FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/teamcity_test-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "teamcity_test-1.0-SNAPSHOT.jar"]