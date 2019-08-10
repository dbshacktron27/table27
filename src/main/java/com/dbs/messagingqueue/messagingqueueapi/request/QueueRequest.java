package com.dbs.messagingqueue.messagingqueueapi.request;

import java.io.Serializable;

public class QueueRequest implements Serializable {

	private String queueName;

	private Integer queueSize;

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public Integer getQueueSize() {
		return queueSize;
	}

	public void setQueueSize(Integer queueSize) {
		this.queueSize = queueSize;
	}

}
