import { Component } from '@angular/core';
import { RecepFunctionsService } from './recep-functions.service';

@Component({
  selector: 'app-recep-functions',
  templateUrl: './recep-functions.component.html',
  styleUrl: './recep-functions.component.css'
})
export class RecepFunctionsComponent {
  recepMenu :String='';
  allRecep:any;
  recepDetail:any
  constructor(private recepFuncService : RecepFunctionsService){

  }

    gotoRecep(input:String){
      this.recepMenu=input;
  }

  createRecep(input:any){
    console.warn(input);
    this.recepFuncService.createRecep(input).subscribe((result) =>{
      alert(result);
    })
  }

  deleteRecep(input:any){
    console.warn(input);
    this.recepFuncService.deleteRecep(input).subscribe((result) =>{
      alert(result);
    });
  }

  viewRecep(input:any){
    console.warn(input);
    this.recepFuncService.viewRecep(input).subscribe((result) =>{
      console.log(result);
      return this.recepDetail=result;
    })
  }

  viewAllRecep(){
    this.recepFuncService.viewAllRecep().subscribe((result) =>{
      console.log(result);
      return this.allRecep=result;
    })
  }



}
