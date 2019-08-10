package com.dbs.messagingqueue.messagingqueueapi.service;

import java.util.List;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueInfo;
import com.dbs.messagingqueue.messagingqueueapi.entity.QueueMessage;

public interface QueueMessageService {

	public QueueInfo createQueue(QueueInfo queueInfo);
	
	public List<QueueInfo> getAllQueueInfo();
	
	public QueueInfo updateQueue(QueueInfo queueInfo);
	
	public void deleteQueue(String queueName);
	
	public QueueMessage addMessage(String queueName, String message);
	
}
