FROM tomcat:8.0-alpine
LABEL maintainer="felipe.francc2@gmail.com"

ADD resqapi.war /usr/local/tomcat/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]