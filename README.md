#set up env variable by editing path --> Open Kafka folder>bin>windows and copy its address.
https://www.javatpoint.com/installation-of-apache-kafka

C:\>kafka-topics.bat   -- To see all kafka commands
	To start zookeeper server...
C:\kafka_2.13-2.7.0>zookeeper-server-start.bat config\zookeeper.properties 

C:\kafka_2.13-2.7.0>kafka-server-start.bat config\server.properties

To kill a process

C:\Users\Prasun>netstat -ano | findstr :8080
  TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       4844
  TCP    [::]:8080              [::]:0                 LISTENING       4844

C:\Users\Prasun>taskkill /PID 4844 /F
SUCCESS: The process with PID 4844 has been terminated.
