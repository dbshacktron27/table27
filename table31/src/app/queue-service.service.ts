import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class QueueServiceService {
 http:HttpClient; 
  constructor(http:HttpClient) { }

  // addQueue() {
  //   return this.http.('10.10.1.79:8080/messagingqueue/create');
  // }
queues:Object;
  getQueue(){
    this.queues = this.http.get<Object>('0.10.1.79:8080/messagingqueue/getAllQueuesInfo').subscribe(data=>{
      console.log(data);
    });
    console.log(this.queues)
    return this.queues;
  }
}
