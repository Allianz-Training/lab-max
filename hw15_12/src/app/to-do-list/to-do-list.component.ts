import { Component, Input, OnInit } from '@angular/core';
import { Task } from '../task/task';

@Component({
  selector: 'app-to-do-list',
  templateUrl: './to-do-list.component.html',
  styleUrls: ['./to-do-list.component.css']
})
export class ToDoListComponent implements OnInit {
  @Input()
  inname: string;
  indesc: string;
  tasks: Task[];
  cuTask: string;
  cuDesc: string;
  constructor() { 
    this.tasks = [];

    this.tasks.push({
      id: 1,
      name: 'Sleep',
      description: 'dewoifjearojfeor'
    });
    this.tasks.push({
      id:2,
      name: 'Wake',
      description: 'daeferewapkdks'
    })
  }
  addTask(){
    this.tasks.push({
      id: 1,
      name: this.inname,
      description: this.indesc
    })
  }
  ngOnInit(): void{}

  deletenow(task:Task){
    this.tasks.splice(this.tasks.indexOf(task),1)
  }

  selectNow(task:Task){
    console.log('test');
    
    this.cuTask = task.name;
    this.cuDesc = task.description;
  }
}
