FROM tomcat:8.0
LABEL maintainer="felipe.francc2@gmail.com"

COPY api.war /usr/local/tomcat/webapps/