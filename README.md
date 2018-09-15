# Kafka_Mongo_Project

This project assumes 
- a local MongoDB instance running at localhost:27017
- a local Zookeeper instance running at localhost:2181
- a local Kafka Broker running at localhost:9092

###Create new topic called "ShoppingCart"
`bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic ShoppingCart`

###Push data into the topic using console producer
`echo "{\"name\":\"Maruthi\"}" | bin/kafka-console-producer.sh --broker-list localhost:9092 --topic ShoppingCart > /dev/null`
