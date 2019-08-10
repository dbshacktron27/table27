package com.dbs.messagingqueue.messagingqueueapi.service;

import java.util.List;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueInfo;

public interface QueueMessageService {

	public QueueInfo createQueue(QueueInfo queueInfo);
	
	public List<QueueInfo> getAllQueueInfo();
	
	public QueueInfo updateQueue(QueueInfo queueInfo);
	
	public void deleteQueue(String queueName);
	
}
