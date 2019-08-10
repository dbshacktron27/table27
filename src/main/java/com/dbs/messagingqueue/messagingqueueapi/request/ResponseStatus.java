package com.dbs.messagingqueue.messagingqueueapi.request;

import java.io.Serializable;

public class ResponseStatus implements Serializable {

	private String status;
	private String queueName;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	
	
}
