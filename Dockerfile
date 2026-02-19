FROM eclipse-temurin:17
COPY terget/JenkinJava.jar JenkinJ.jar
CMD ["java","-jar","JenkinsJ.jar"]