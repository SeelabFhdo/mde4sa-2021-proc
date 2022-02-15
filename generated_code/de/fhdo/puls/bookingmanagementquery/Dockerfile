FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} bookingmanagementquerycontainer.jar
ENTRYPOINT ["java","-jar","/bookingmanagementquerycontainer.jar"]
