package com.webmovie.bigdata.kafka.demo01;

public interface KafkaPropertiesDemo01 {

	final static String zkConnect = "beifeng-hadoop-02:2181";
	final static String groupId = "group1";
	final static String topic = "topic1";
	final static String kafkaServerURL = "beifeng-hadoop-02";
	final static int kafkaServerPort = 9092;
	final static int kafkaProducerBufferSize = 64 * 1024;
	final static int connectionTimeOut = 20000;
	final static int reconnectInterval = 10000;
	final static String topic2 = "topic2";
	final static String topic3 = "topic3";
	final static String clientId = "SimpleConsumerDemoClient";
	

}
