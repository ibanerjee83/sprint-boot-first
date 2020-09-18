FROM java:8-jdk-alpine
RUN mkdir -p /usr/app/
COPY sprint-boot-first-0.0.1-SNAPSHOT.war /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","sprint-boot-first-0.0.1-SNAPSHOT.war"]