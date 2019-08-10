package com.dbs.messagingqueue.messagingqueueapi.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueInfo;
import com.dbs.messagingqueue.messagingqueueapi.respository.MessageQueueRepository;

@RunWith(SpringRunner.class)
public class MessageQueuesServiceImplTest{
	
	@InjectMocks
	MessageQueuesServiceImpl messageQueuesServiceImpl;

	@Mock
	private MessageQueueRepository repository;
	
@Test
	public void test_getQueueMessages_success() {
	
		
	List<?> queuelist=messageQueuesServiceImpl.getQueueMessages();
	}
}
