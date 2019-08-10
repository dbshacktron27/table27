package com.dbs.messagingqueue.messagingqueueapi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueInfo;
import com.dbs.messagingqueue.messagingqueueapi.request.QueueRequest;
import com.dbs.messagingqueue.messagingqueueapi.request.ResponseStatus;
import com.dbs.messagingqueue.messagingqueueapi.service.QueueMessageService;

@RestController
@RequestMapping(path = "/messagingqueue")
@CrossOrigin(allowedHeaders = "*")
public class MessagingQueueController {
	
	@Autowired
	private QueueMessageService service;


	@PostMapping(path  ="/create")
	public ResponseEntity<ResponseStatus> createQueue(@RequestBody QueueRequest request) {
		
		QueueInfo queue = new QueueInfo();
		
		queue.setQueueMessage(request.getQueueName());
		queue.setQueueSize(request.getQueueSize());
		
		QueueInfo queueData = service.createQueue(queue);
		
		ResponseStatus responseStatus = new ResponseStatus();
		responseStatus.setStatus("Create");
		responseStatus.setQueueName(queueData.getQueueMessage());
		
		return new ResponseEntity<ResponseStatus>(responseStatus, HttpStatus.CREATED);
	}
	
	
}
