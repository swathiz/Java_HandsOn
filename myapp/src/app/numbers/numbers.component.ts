import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-numbers',
  templateUrl: './numbers.component.html',
  styleUrls: ['./numbers.component.css']
})
export class NumbersComponent implements OnInit {

  showNumbers=true;
  numbers = [1,2,3,,4,534,23,78,789,21,12];
boxNumber=1;

  constructor() { }

  ngOnInit(): void {
  }

  toggelShow(){
    this.showNumbers=!this.showNumbers;
  }

}
