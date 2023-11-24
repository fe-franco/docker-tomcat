FROM tomcat:9.0.83-jdk8-corretto-al2
LABEL maintainer="felipe.francc2@gmail.com"

COPY api.war /usr/local/tomcat/webapps/