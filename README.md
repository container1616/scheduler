# scheduler
Scheduler in spring .. Same code as container1616/gs-scheduling-tasks, no spring boot 

Just in case you want to run and without directly pulling from the director.. Here is what you can do. 

1) Get a machine in digital ocean (or something cheaper if you can find)

2) Install OpenJDK 8,  docker and maven

3) git clone https://github.com/container1616/scheduler.git

4) mvn install 

5) java -jar ./target/jar.simple-0.0.1-SNAPSHOT-jar-with-dependencies.jar [to make sure that maven completed its work]

6) docker build -t scheduler .

7) docker run --name container-1 -dv /root/logs:/logs scheduler

8) docker ps [to validate whether container has started or not, it should show container named "container-1"]

9)  tail -f logs/logging.log [Should be able to see the log generated by java program current time and quote.]


Instruction to push to container1616-docker-local.jfrog.io registry (private). If this image needs to be made available publicly push this to docker hub. 

docker login container1616-docker-local.jfrog.io


docker tag [image name] container1616-docker-local.jfrog.io/scheduler

docker push container1616-docker-local.jfrog.io/scheduler

-------------------
__________________________
