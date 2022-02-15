FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} chargingstationmanagementcommandcontainer.jar
ENTRYPOINT ["java","-jar","/chargingstationmanagementcommandcontainer.jar"]
