FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} environmentaldataanalysiscommandcontainer.jar
ENTRYPOINT ["java","-jar","/environmentaldataanalysiscommandcontainer.jar"]
