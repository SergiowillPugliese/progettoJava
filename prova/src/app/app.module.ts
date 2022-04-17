import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DioComponent } from './components/dio/dio.component';
import { PorcoComponent } from './components/porco/porco.component';
import { HomepageComponent } from './components/homepage/homepage.component';
import { Pagina1Component } from './components/pagina1/pagina1.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    PorcoComponent,
    DioComponent,
    HomepageComponent,
    Pagina1Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
