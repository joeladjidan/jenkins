# Dockerfile
FROM openjdk:8
VOLUME /tmp
ARG JAR_FILE=target/*.jar
#COPY target/${JAR_FILE} spring-boot-mongodb-0.0.1.jar 
ADD target/${JAR_FILE} spring-boot-mongodb-0.0.1.jar spring-boot-mongodb-0.0.1.jar
RUN mvn clean package
EXPOSE 8081
ENTRYPOINT ["java","-jar","/spring-boot-mongodb-0.0.1.jar"]

