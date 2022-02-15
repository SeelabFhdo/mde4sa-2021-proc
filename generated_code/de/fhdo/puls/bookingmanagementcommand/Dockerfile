FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} bookingmanagementcommandcontainer.jar
ENTRYPOINT ["java","-jar","/bookingmanagementcommandcontainer.jar"]
