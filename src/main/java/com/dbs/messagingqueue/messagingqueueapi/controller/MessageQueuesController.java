package com.dbs.messagingqueue.messagingqueueapi.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueMessage;
import com.dbs.messagingqueue.messagingqueueapi.request.QueueRequest;
import com.dbs.messagingqueue.messagingqueueapi.service.MessageQueuesService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(path = "/messagingqueues")
@CrossOrigin(allowedHeaders = "*")
public class MessageQueuesController {
	
	@Autowired
	private MessageQueuesService messageQueuesService;


	@PostMapping(path  ="/list")
	public ResponseEntity<String> createQueue(@RequestBody QueueRequest request) {
		
		List<QueueMessage> queueMessages = messageQueuesService.getQueueMessages();
		
		// Creating Object of ObjectMapper define in Jakson Api 
        ObjectMapper Obj = new ObjectMapper(); 
        String jsonString = null;
  
        try { 
  
            // get Oraganisation object as a json string 
        	jsonString = Obj.writeValueAsString(queueMessages); 
           
        } 
  
        catch (IOException e) { 
            e.printStackTrace(); 
        } 
		
		return new ResponseEntity<String>(jsonString, HttpStatus.ACCEPTED);
	}
	
	
}
