import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RecepFunctionsService {

  constructor(private http: HttpClient) { }

  createRecep(input:any){
    return this.http.post('http://localhost:8080/receptionist',input, { responseType: 'text' })
  }

  deleteRecep(input:any){
    let receptionistId= input.receptionistId;
    let url1=`http://localhost:8080/receptionist/remove/${receptionistId}`;
    return this.http.delete(url1,{ responseType: 'text' });
  }

  viewRecep(input:any){
    let receptionistId= input.receptionistId;
    let url2=`http://localhost:8080/receptionist/get/${receptionistId}`;
    return this.http.get(url2);
  }

  viewAllRecep(){
    return this.http.get('http://localhost:8080/receptionist/getall');
  }
}
