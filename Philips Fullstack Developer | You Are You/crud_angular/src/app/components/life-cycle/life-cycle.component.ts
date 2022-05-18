import { AfterContentChecked, AfterContentInit, AfterViewChecked, DoCheck, OnChanges, OnDestroy, SimpleChanges, Input } from '@angular/core';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-life-cycle',
  templateUrl: './life-cycle.component.html',
  styleUrls: ['./life-cycle.component.css']
})
export class LifeCycleComponent implements OnInit, OnChanges, DoCheck, 
AfterContentInit, AfterContentChecked, AfterViewChecked, OnDestroy  {

  @Input() number = 10;
  constructor() {
    console.log('chamou o construtor');
   }
  ngDoCheck(): void {
    console.log('chamou o DoCheck');
  }
  ngAfterContentInit(): void {
    console.log('chamou o AfterContentInit');
  }
  ngAfterContentChecked(): void {
    console.log('chamou o AfterContentChecked');
  }
  ngAfterViewChecked(): void {
    console.log('chamou o AfterViewChecked');
  }
  ngOnDestroy(): void {
    console.log('chamou o OnDestroy');
  }
  ngOnChanges(): void {
    console.log('chamou o OnChanges');
  }

  ngOnInit(): void {
    console.log('chamou o OnInit')
  }

}
