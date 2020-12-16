import { Injectable } from '@angular/core';
import { Product } from './catelog/product/product';

@Injectable({
  providedIn: 'root'
})
export class BackendService {

  constructor() { }

  getProducts(): Product[]{
    return[{
      name :'desfsefes',
      price:45343534
    },
    {
      name: 'dsds',
      price: 45332
    }];
  }
  getProductById(productId: number): Product{
    return;
  }
}
