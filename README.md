Access to console :
- docker exec -it "CONTAINER_ID" /bin/bash
- cd /bin
- kafka-console-producer --broker-list 127.0.0.1:29092 --topic "topic_name" 
or
- kafka-console-consumer --bootstrap-server 127.0.0.1:29092 --topic "topic_name"