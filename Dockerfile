from container1616/centos
ADD ./target/jar.simple-0.0.1-SNAPSHOT-jar-with-dependencies.jar 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/jar.simple-0.0.1-SNAPSHOT-jar-with-dependencies.jar.jar"]
