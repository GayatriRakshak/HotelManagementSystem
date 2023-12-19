import { Component } from '@angular/core';
import { ReceptionistService } from './receptionist.service';

@Component({
  selector: 'app-receptionist',
  templateUrl: './receptionist.component.html',
  styleUrl: './receptionist.component.css'
})
export class ReceptionistComponent {
   recepMenu :String ='';

   constructor(private recepService:ReceptionistService){

   }

   goto(input:String){
        this.recepMenu=input;
   }

   updateRecep(input:any){
    console.warn(input);
    this.recepService.updateRecep(input).subscribe((result) =>{
      alert(result);
    })
   }
}
