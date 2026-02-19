FROM eclipse-temurin:17
COPY terget/JenkinJava.jar JenkinJava.jar
CMD ["java","-jar","JenkinsJava.jar"]