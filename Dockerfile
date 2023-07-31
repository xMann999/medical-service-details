FROM eclipse-temurin:17-jdk-alpine
COPY target/medicalClinicDetailsApp-0.0.1-SNAPSHOT.jar medicalClinicDetailsApp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/medicalClinicDetailsApp-0.0.1-SNAPSHOT.jar"]