package com.dbs.messagingqueue.messagingqueueapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.messagingqueue.messagingqueueapi.request.QueueRequest;

@RestController
@RequestMapping(path = "/messagingqueue")
@CrossOrigin(allowedHeaders = "*")
public class MessagingQueueController {


	@PostMapping(path = "/create")
	public ResponseEntity<String> createQueue(@RequestBody QueueRequest request) {
		
		return new ResponseEntity<String>("saved", HttpStatus.CREATED);
	}
	
}
