import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-ordine',
  templateUrl: './ordine.component.html',
  styleUrls: ['./ordine.component.scss']
})
export class OrdineComponent implements OnInit {
  toppings: FormGroup;

  constructor(fb : FormBuilder) {
    this.toppings = fb.group({
      pasta: false,
      carne: false,
      cibo: false,
    })
  }

  ngOnInit(): void {
  }

}
