import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './components/homepage/homepage.component';
import { Pagina1Component } from './components/pagina1/pagina1.component';

const routes: Routes = [
  {path:"", component: HomepageComponent},
  {path:"pippo", component: Pagina1Component} 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
