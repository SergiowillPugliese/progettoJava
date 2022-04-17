import { Component, OnInit } from "@angular/core";

@Component({
    selector: 'app-dio',
    templateUrl: './dio.component.html',
    styleUrls: ['./dio.component.scss']
  })
export class DioComponent implements OnInit{

    vociMenu:string[] = [];

    constructor(){

    }

    ngOnInit(): void {
        this.vociMenu[0] = 'cazzi';
        this.vociMenu[1] = 'culi';
        this.vociMenu[2] = 'tette';
        this.vociMenu[3] = 'Alessandro';
        this.vociMenu[4] = 'madonne';
        this.vociMenu[5] = 'preti pedofili'; 
    }

}