package com.dbs.messagingqueue.messagingqueueapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueMessage;
import com.dbs.messagingqueue.messagingqueueapi.respository.MessageQueueRepository;
import com.dbs.messagingqueue.messagingqueueapi.service.MessageQueuesService;

@Service
public class MessageQueuesServiceImpl implements MessageQueuesService{

	@Autowired
	private MessageQueueRepository repository;
	
	@Override
	public List<QueueMessage> getQueueMessages() {
		List<QueueMessage> queueMessages= repository.findAll();
		
		return queueMessages;
	}
}
