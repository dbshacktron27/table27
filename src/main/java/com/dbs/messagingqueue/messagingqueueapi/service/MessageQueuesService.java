package com.dbs.messagingqueue.messagingqueueapi.service;

import java.util.List;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueMessage;

public interface MessageQueuesService {

	public List<QueueMessage> getQueueMessages();
}
