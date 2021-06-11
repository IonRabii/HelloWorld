FROM openjdk:8
USER root

RUN mkdir -p /opt/app
COPY target/*.jar /opt/app/
EXPOSE 7880
ENTRYPOINT ["java","-Xms512m","-Xmx1024m","-jar", "/opt/app/HelloWorld-1.1-fat.jar"]
