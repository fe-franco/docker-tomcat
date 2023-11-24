FROM tomcat:8.0
LABEL maintainer="felipe.francc2@gmail.com"

# Install Java 8
RUN apt-get update && apt-get install -y openjdk-8-jdk && apt-get clean;

# Set JAVA_HOME to use Java 8
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64/

COPY api.war /usr/local/tomcat/webapps/
