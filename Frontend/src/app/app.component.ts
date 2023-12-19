import { Component, OnInit } from '@angular/core';
import { Routes } from '@angular/router';
import { Observable, timer } from 'rxjs';
import { timeout } from 'rxjs/operators';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  


  constructor() {


    const routes: Routes = [
      { path: '', redirectTo: '/about' },
      ];


      
    const observable = timer(10000); // Increase the timeout to 10 seconds
    observable.pipe(timeout(10000)).subscribe(() => {
      // Close the channel
    });
  }

  ngOnInit() {
  }
}
