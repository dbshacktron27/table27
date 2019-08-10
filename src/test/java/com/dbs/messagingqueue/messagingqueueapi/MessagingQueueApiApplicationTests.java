package com.dbs.messagingqueue.messagingqueueapi;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueInfo;
import com.dbs.messagingqueue.messagingqueueapi.request.QueueRequest;
import com.dbs.messagingqueue.messagingqueueapi.request.ResponseStatus;
import com.dbs.messagingqueue.messagingqueueapi.respository.MessageQueueRespository;
import com.dbs.messagingqueue.messagingqueueapi.service.QueueMessageService;
import com.dbs.messagingqueue.messagingqueueapi.service.impl.QueueMessageServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessagingQueueApiApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("hi test ");
	}

	@Test
	public void createQueueNotNull(){
		QueueRequest request = new QueueRequest();
		request.setQueueName("q1");
		request.setQueueSize(10);
		Assert.assertNotNull(request.getQueueName());
		Assert.assertNotNull(request.getQueueSize());
			}
	
	@Test
	public void createQueueSuccess(){
		QueueRequest request = new QueueRequest();
		QueueInfo info = new QueueInfo();
		request.setQueueName("q1");
		request.setQueueSize(10);
		info.setQueueMessage(request.getQueueName());
		info.setQueueSize(request.getQueueSize());
		QueueMessageServiceImpl service = new QueueMessageServiceImpl();
		service.createQueue(info);
		ResponseStatus responseStatus = new ResponseStatus();
		responseStatus.setStatus("Create");
        Assert.assertEquals("Create", responseStatus.getStatus());
        Assert.assertSame(200, HttpStatus.CREATED);
	}
}
