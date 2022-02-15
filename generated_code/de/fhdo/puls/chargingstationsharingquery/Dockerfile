FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} chargingstationsharingquerycontainer.jar
ENTRYPOINT ["java","-jar","/chargingstationsharingquerycontainer.jar"]
