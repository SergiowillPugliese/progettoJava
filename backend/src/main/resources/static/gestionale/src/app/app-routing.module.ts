import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomebarComponent } from './components/homebar/homebar.component';
import { LoginComponent } from './components/login/login.component';
import { MenuComponent } from './components/menu/menu.component';
const routes: Routes = [

  {
    path: "",
    component: LoginComponent,
  },
 
  {
    path: "home",
    component: HomebarComponent,
  },
  
  {
    path: "menu",
    component: MenuComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
