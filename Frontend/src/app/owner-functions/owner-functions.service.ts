import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OwnerFunctionsService {

  constructor(private http:HttpClient) { }

  updateOwner(input:any){
    return this.http.put('http://localhost:8080/owner/update',input,{ responseType: 'text' });
  }

  deleteOwner(input:any){
    let OwnerId=input.ownerId;
    let url1=`http://localhost:8080/owner/remove/${OwnerId}`;
    return this.http.delete(url1,{ responseType: 'text' });
  }

  viewOwner(input:any){
    let ownerId=input.ownerId;
    let url2=`http://localhost:8080/owner/get/${ownerId}`;
    return this.http.get(url2);
  }
}
