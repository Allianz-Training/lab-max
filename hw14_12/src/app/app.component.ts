import { Component, ViewChild, AfterViewInit } from '@angular/core';
import { ProductListComponent } from './product-list/product-list.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements AfterViewInit{
  @ViewChild('productList')
  productList: ProductListComponent;
  
  ngAfterViewInit(): void{
    this.productList.products = [
      {name: 'Som O', price: 111},
      {name: 'Watermelon', price: 222},
      {name: 'Coconut', price: 333}
    ];
  }
  constructor(){}
}
