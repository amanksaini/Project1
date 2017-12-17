FROM tomcat:8.0.20-jre8

MAINTAINER <Amanjit Kaur>
COPY ./dist/vehdeal.war /usr/local/tomcat/webapps/vehdeal.war
