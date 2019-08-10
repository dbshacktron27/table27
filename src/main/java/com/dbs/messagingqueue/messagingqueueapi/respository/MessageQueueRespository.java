package com.dbs.messagingqueue.messagingqueueapi.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.messagingqueue.messagingqueueapi.entity.QueueInfo;

@Repository
public interface MessageQueueRespository extends JpaRepository<QueueInfo, String> {

}
