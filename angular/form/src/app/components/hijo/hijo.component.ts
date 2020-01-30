import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hijo',
  templateUrl: './hijo.component.html',
  styleUrls: ['./hijo.component.css']
})
export class HijoComponent implements OnInit {

  private nombre: string;
  private ciudad: string;

  constructor() { 
    this.nombre = "Fernando Mendoza";
    this.ciudad = "Monterrey"
  }

  ngOnInit() {
  }

}
