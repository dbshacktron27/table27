package com.dbs.messagingqueue.messagingqueueapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "queue_message")
public class QueueMessage {

	@Id
	@Column(name = "queue_message_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer queueMessageId;
	

	@Column(name = "queue_message")
	private String queueMessage;

	@Column(name = "message_status")
	private String messageStatus;

	@ManyToOne
	@JoinColumn(referencedColumnName = "queue_message", name = "queue_message", insertable = false,updatable = false)
	private QueueInfo queueInfo;

	public Integer getQueueMessageId() {
		return queueMessageId;
	}

	public void setQueueMessageId(Integer queueMessageId) {
		this.queueMessageId = queueMessageId;
	}

	public String getQueueMessage() {
		return queueMessage;
	}

	public void setQueueMessage(String queueMessage) {
		this.queueMessage = queueMessage;
	}

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

	public QueueInfo getQueueInfo() {
		return queueInfo;
	}

	public void setQueueInfo(QueueInfo queueInfo) {
		this.queueInfo = queueInfo;
	}

}
