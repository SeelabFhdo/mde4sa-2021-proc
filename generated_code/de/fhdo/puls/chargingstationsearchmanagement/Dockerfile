FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} chargingstationsearchcontainer.jar
ENTRYPOINT ["java","-jar","/chargingstationsearchcontainer.jar"]
