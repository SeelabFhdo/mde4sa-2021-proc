FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} chargingstationsharingcommandcontainer.jar
ENTRYPOINT ["java","-jar","/chargingstationsharingcommandcontainer.jar"]
