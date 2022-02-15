FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} chargingstationmanagementquerycontainer.jar
ENTRYPOINT ["java","-jar","/chargingstationmanagementquerycontainer.jar"]
