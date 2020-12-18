import { HttpClient } from '@angular/common/http';
import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-convert',
  templateUrl: './convert.component.html',
  styleUrls: ['./convert.component.css']
})
export class ConvertComponent implements OnInit {
  fxrate: number;
  constructor(private httpClient: HttpClient) { }
  @Input()
  amount: number;
  @Input()
  amount2: number;
  @Input()
  curr: string;
  @Input()
  curr2: string;
  ngOnInit() {

  };

  doConvert() {
    this.httpClient
      .get(`https://api.exchangeratesapi.io/latest?symbols=${this.curr2}&base=${this.curr}`)
      .subscribe(result => {
        console.log(result);
       this.fxrate = result['rates'][this.curr2];
       this.amount2 = this.amount*this.fxrate
      });
  }


}
