package com.dbs.messagingqueue.messagingqueueapi.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueInfo;
import com.dbs.messagingqueue.messagingqueueapi.respository.MessageQueueRespository;

@RunWith(SpringRunner.class)
public class QueueMessageServiceImplTest{

	@InjectMocks
	QueueMessageServiceImpl queueMessageServiceImpl;
	
	@Mock
	private MessageQueueRespository respository;
		
		
	
	@Test
	public void test_createQueue_success() {
		
		QueueInfo queueInfo= new QueueInfo();
		queueMessageServiceImpl.createQueue(queueInfo);
	}
	
	
	@Test
	public void test_getAllQueueInfo_success() {
		
	List<QueueInfo> queuelist=	queueMessageServiceImpl.getAllQueueInfo();
		
		
	}
}
