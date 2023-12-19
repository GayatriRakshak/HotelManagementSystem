import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutComponent } from './about/about.component';
import { AdminComponent } from './admin/admin.component';
import { AdminFunctionsComponent } from './admin-functions/admin-functions.component';
import { BookingComponent } from './booking/booking.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { OwnerComponent } from './owner/owner.component';
import { OwnerFunctionsComponent } from './owner-functions/owner-functions.component';
import { RecepFunctionsComponent } from './recep-functions/recep-functions.component';
import { ReceptionistComponent } from './receptionist/receptionist.component';
import { RoomComponent } from './room/room.component';
import { HttpClientModule, provideHttpClient, withFetch } from '@angular/common/http';
import { SignupComponent } from './signup/signup.component';
import { LoginOwnerComponent } from './login-owner/login-owner.component';
import { LoginRecepComponent } from './login-recep/login-recep.component';

@NgModule({
  declarations: [
    AppComponent,
    AboutComponent,
    AdminComponent,
    AdminFunctionsComponent,
    BookingComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    OwnerComponent,
    OwnerFunctionsComponent,
    RecepFunctionsComponent,
    ReceptionistComponent,
    RoomComponent,
    SignupComponent,
    LoginOwnerComponent,
    LoginRecepComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
    
  ],
  providers: [
    provideHttpClient(withFetch()),
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
