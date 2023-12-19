import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminFunctionsService {

  constructor(private http:HttpClient) { }

  createAdmin(input:any){
    return this.http.post('http://localhost:8080/admin',input,{ responseType: 'text' });
  }

  deleteAdmin(input:any){
    let adminId=input.adminId;
    let url1=`http://localhost:8080/admin/remove/${adminId}`;
    return this.http.delete(url1,{ responseType: 'text' });
  }

  viewAdmin(input:any){
    let adminId=input.adminId;
    let url2= `http://localhost:8080/admin/get/${adminId}`;
    return this.http.get(url2);
  }

  viewAllAdmin(){
    return this.http.get('http://localhost:8080/admin/getall');
  }
}
