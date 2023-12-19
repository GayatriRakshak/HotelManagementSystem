import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { FormsModule } from "@angular/forms";
import { BookingComponent } from './booking.component';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@NgModule({
    declarations: [
        
      BookingComponent,
      
    ],
    imports: [
        CommonModule,
      BrowserModule,
      FormsModule,
      NgForm,
      HttpClientModule
    ],
    providers: [
      provideClientHydration()
    ],
    bootstrap: []
  })
  export class bookingModule { }