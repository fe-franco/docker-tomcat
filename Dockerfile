FROM tomcat:9.0.83-jdk8-corretto-al2
LABEL maintainer="felipe.francc2@gmail.com"

# Install Maven
RUN yum install -y maven

# Copy the source code to the container
COPY . /usr/src/app

# Set the working directory
WORKDIR /usr/src/app

# Build the application
RUN mvn clean package

# Copy the built artifact to Tomcat webapps directory
COPY ./target/api.war /usr/local/tomcat/webapps/
