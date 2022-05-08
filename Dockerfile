FROM openjdk:11
MAINTAINER Kunal Choithani kunalchoithani2013@gmail.com
WORKDIR ./
COPY ./target/*.jar ./
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/Calculator-1.0-SNAPSHOT.jar"]