package com.dbs.messagingqueue.messagingqueueapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "queue_info")
public class QueueInfo {

	@Id
	@Column(name = "queue_message")
	private String queueMessage;

	@Column(name = "queue_size")
	private Integer queueSize;

	public String getQueueMessage() {
		return queueMessage;
	}

	public void setQueueMessage(String queueMessage) {
		this.queueMessage = queueMessage;
	}

	public Integer getQueueSize() {
		return queueSize;
	}

	public void setQueueSize(Integer queueSize) {
		this.queueSize = queueSize;
	}

}
