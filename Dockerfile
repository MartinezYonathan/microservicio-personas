FROM openjdk:8-jdk-slim
RUN pwd
ADD ./target/servicio-personas-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8882
ENTRYPOINT ["java","-jar","app.jar"]
