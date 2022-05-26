import { FilterArea } from './../product-list/model/filter';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Component,  OnInit } from '@angular/core';


@Component({
  selector: 'app-filters',
  templateUrl: './filters.component.html',
  styleUrls: ['./filters.component.css']
})

export class FiltersComponent implements OnInit {

  filterForm: FormGroup;
  filterArea: FilterArea = {
  valorDe: 0,
  valorAte: 0,
}

  constructor(private formBuilder: FormBuilder) {
    this.filterForm = this.formBuilder.group({
      valorDe: 0,
      valorAte:0,

    })
    
   }

  ngOnInit(): void {
   
  }

   filter(): void{
    this.filterArea = this.filterForm.value;
    
     console.log("filtro", this.filterArea.valorDe,'***' , this.filterArea.valorAte)
    
  }

}
