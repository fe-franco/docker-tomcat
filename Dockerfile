FROM tomcat:8.0
LABEL maintainer="felipe.francc2@gmail.com"

COPY resqapi.war /usr/local/tomcat/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]