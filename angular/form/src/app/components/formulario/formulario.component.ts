import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {

  private valor1:number = 0;
  private valor2:number = 0;
  private resultado:number = 0;

  sumar() {
    this.resultado = this.valor1 + this.valor2;
  }
  resta() {
    this.resultado = this.valor1 - this.valor2;
  }
  division() {
    this.resultado = this.valor1 / this.valor2;
  }
  multiplicacion() {
    this.resultado = this.valor1 * this.valor2;
  }

  constructor() { 
    

  }

  ngOnInit() {
  }

  

}
