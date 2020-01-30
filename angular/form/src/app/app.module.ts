import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PeliculasComponent } from './components/peliculas/peliculas.component';
import { SeriesComponent } from './components/series/series.component';
import { VideojuegosComponent } from './components/videojuegos/videojuegos.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { appRoutingProviders, routing } from './app.routing';
import { PadreComponent } from './components/padre/padre.component';
import { HijoComponent } from './components/hijo/hijo.component';
import { FormularioComponent } from './components/formulario/formulario.component';

import {FormsModule} from '@angular/forms';

import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { PerrosComponent } from './components/perros/perros.component';
@NgModule({
  declarations: [
    AppComponent,
    PeliculasComponent,
    SeriesComponent,
    VideojuegosComponent,
    NavbarComponent,
    PadreComponent,
    HijoComponent,
    FormularioComponent,
    PerrosComponent
  ],
  imports: [
    BrowserModule,routing , MatInputModule,
    MatButtonModule,
    FormsModule,
    NoopAnimationsModule
  ],
  providers: [appRoutingProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
