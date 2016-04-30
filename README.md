# scheduler
Scheduler in spring .. Same code as container1616/gs-scheduling-tasks, no spring boot 

To run...

git clone https://github.com/container1616/scheduler.git

mvn install 

java -jar ./target/jar.simple-0.0.1-SNAPSHOT-jar-with-dependencies.jar // to make sure that maven completed its work

docker build -t scheduler .

docker run schedule

