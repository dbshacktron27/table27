package com.dbs.messagingqueue.messagingqueueapi.service.impl;

import java.util.List;
import java.util.Optional;

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
	
	@Override
	public QueueInfo updateQueue(QueueInfo queueInfo) {
		
		Optional<QueueInfo> findById = respository.findById(queueInfo.getQueueMessage());
		QueueInfo queueInfo2 = findById.get();
		
		queueInfo2.setQueueSize(queueInfo.getQueueSize());
		QueueInfo save = respository.save(queueInfo2);
		
		return save;
	}
	
	@Override
	public void deleteQueue(String queueName) {
		
		respository.deleteById(queueName);
	}
}
