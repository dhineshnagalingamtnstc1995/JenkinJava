FROM eclipse-temurin:17
COPY target/JenkinJava.jar JenkinJava.jar
CMD ["java","-jar","JenkinsJava.jar"]