import { Component } from '@angular/core';
import { QueueServiceService } from './queue-service.service';
export interface QueueInfo {
  qname: string;
  position: number;
  qmessage: string;
  update: string;
  delete:string
}
const ELEMENT_DATA: QueueInfo[] = [
  {position: 1, qname: 'q1', qmessage:'hi', delete: 'delete',update:'update'}
];

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AngularUpdatedLatestWS';
  service:QueueServiceService;
  displayedColumns: string[] = ['position', 'qname', 'qmessage', 'delete','update'];
  dataSource = ELEMENT_DATA;
  constructor(service:QueueServiceService) {
    
   }

 getQueue(){

return this.service.getQueue();
 }
}
