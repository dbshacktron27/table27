package com.dbs.messagingqueue.messagingqueueapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueInfo;
import com.dbs.messagingqueue.messagingqueueapi.respository.MessageQueueRespository;
import com.dbs.messagingqueue.messagingqueueapi.service.QueueMessageService;

@Service
public class QueueMessageServiceImpl implements QueueMessageService{

	
	@Autowired
	private MessageQueueRespository respository;
	
	
	@Override
	public QueueInfo createQueue(QueueInfo queueInfo) {
		
		QueueInfo save = respository.save(queueInfo);
		return save;
	}
	
	@Override
	public List<QueueInfo> getAllQueueInfo() {
		return respository.findAll();
	}
}
