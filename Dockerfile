from container1616/centos
RUN mkdir /scheduler
COPY ./target/jar.simple-0.0.1-SNAPSHOT-jar-with-dependencies.jar /scheduler/
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/scheduler/jar.simple-0.0.1-SNAPSHOT-jar-with-dependencies.jar"]
