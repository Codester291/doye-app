FROM openjdk:11
ARG JAR_FILE=build/libs/doye-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} doye.jar
EXPOSE 8991
ENTRYPOINT ["java","-jar","/doye.jar"]
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar doye.jar
