import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookingComponent } from './booking/booking.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { OwnerComponent } from './owner/owner.component';
import { ReceptionistComponent } from './receptionist/receptionist.component';
import { AdminComponent } from './admin/admin.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { LoginOwnerComponent } from './login-owner/login-owner.component';
import { LoginRecepComponent } from './login-recep/login-recep.component';

const routes: Routes = [
  
  { path:'', component : HomeComponent},
  { path:'about', component :  AboutComponent},
  { path:'owner', component :  OwnerComponent},
  { path:'admin', component :  AdminComponent},
  { path:'login', component :  LoginComponent},
  { path:'receptionist', component :  ReceptionistComponent},
  { path:'signup', component: SignupComponent},
  { path:'login-owner', component:LoginOwnerComponent},
  { path:'login-recep', component:LoginRecepComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
