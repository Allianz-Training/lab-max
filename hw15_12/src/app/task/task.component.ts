import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';
import { Task } from './task';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {
  @Input()
  task: Task;
  
  constructor() {}
  ngOnInit() {}
  @Output()
  OnDelete: EventEmitter<Task> = new EventEmitter();
  
  @Output()
  OnSelect: EventEmitter<Task> = new EventEmitter();
  deleteTask(){
    this.OnDelete.emit(this.task)
  }
  selectdesc(){
    console.log('test0');
    
    this.OnSelect.emit(this.task)
  }
}
