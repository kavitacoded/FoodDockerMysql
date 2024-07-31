FROM openjdk:17
EXPOSE 4041
COPY target/frest.jar frest.jar
ENTRYPOINT["java","-jar",frest.jar]