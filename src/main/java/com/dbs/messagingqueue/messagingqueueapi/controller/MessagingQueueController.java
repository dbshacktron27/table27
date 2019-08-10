package com.dbs.messagingqueue.messagingqueueapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueInfo;
import com.dbs.messagingqueue.messagingqueueapi.entity.QueueMessage;
import com.dbs.messagingqueue.messagingqueueapi.request.QueueRequest;
import com.dbs.messagingqueue.messagingqueueapi.request.ResponseStatus;
import com.dbs.messagingqueue.messagingqueueapi.service.QueueMessageService;

@RestController
@RequestMapping(path = "/messagingqueue")
@CrossOrigin(allowedHeaders = "*")
public class MessagingQueueController {

	@Autowired
	private QueueMessageService service;

	@PostMapping(path = "/create")
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
	
	@GetMapping(path = "/addMessage")
	public ResponseEntity<QueueMessage> addMessageUnderQueue(@RequestParam String queueName,@RequestParam String message){
	
		QueueMessage addMessage = service.addMessage(queueName, message);
		
		return new ResponseEntity<QueueMessage>(addMessage, HttpStatus.CREATED);
	}

	@GetMapping(path = "/getAllQueuesInfo")
	public ResponseEntity<List<QueueInfo>> getAllQueues() {

		return new ResponseEntity<List<QueueInfo>>(service.getAllQueueInfo(), HttpStatus.OK);
	}

	@PutMapping(path = "/updateQueueInfor")
	public ResponseEntity<ResponseStatus> updateQueueInfo(@RequestBody QueueRequest request) {

		QueueInfo queue = new QueueInfo();

		queue.setQueueMessage(request.getQueueName());
		queue.setQueueSize(request.getQueueSize());

		QueueInfo updateQueue = service.updateQueue(queue);

		ResponseStatus responseStatus = new ResponseStatus();
		responseStatus.setStatus("Updated");
		responseStatus.setQueueName(updateQueue.getQueueMessage());

		return new ResponseEntity<ResponseStatus>(responseStatus, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(path = "/deleteQueue")
	public ResponseEntity<ResponseStatus> deleteQueue(@RequestParam("queueName") String queueName){
		
		service.deleteQueue(queueName);
		
		ResponseStatus responseStatus = new ResponseStatus();
		responseStatus.setStatus("Deleted");
		
		return new ResponseEntity<ResponseStatus>(responseStatus, HttpStatus.ACCEPTED);
	}
	

}
