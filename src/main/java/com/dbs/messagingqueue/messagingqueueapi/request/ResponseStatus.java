package com.dbs.messagingqueue.messagingqueueapi.request;

import java.io.Serializable;

public class ResponseStatus implements Serializable {

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
