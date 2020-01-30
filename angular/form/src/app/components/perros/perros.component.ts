import { Component, OnInit } from '@angular/core';
import {Perros} from "./perros"
@Component({
  selector: 'app-perros',
  templateUrl: './perros.component.html',
  styleUrls: ['./perros.component.css']
})
export class PerrosComponent implements OnInit {

  private perro: Perros;

  constructor() {
    this.perro = new Perros("","","","");  
   }

  ngOnInit() {
  }

  onSubmit(){
    console.log("Perros", this.perro);
  }

}
