import { Routes, RouterModule } from '@angular/router';
import { PeliculasComponent } from './components/peliculas/peliculas.component';
import { SeriesComponent } from './components/series/series.component';
import { VideojuegosComponent } from './components/videojuegos/videojuegos.component';
import { ModuleWithProviders } from '@angular/compiler/src/core';


const routes: Routes = [
  {path:"" , component: PeliculasComponent},
  {path:"peliculas", component: PeliculasComponent},
  {path:"series", component: SeriesComponent},
  {path:"videojuegos", component: VideojuegosComponent},
  {path:"**", component: SeriesComponent},
];


export const appRoutingProviders : any[] = [] ;
export const routing: ModuleWithProviders = RouterModule.forRoot(routes);