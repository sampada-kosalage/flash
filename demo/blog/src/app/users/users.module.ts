import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { UsersComponent } from './users.component';



@NgModule({
  declarations: [LoginComponent, UsersComponent],
  imports: [
    CommonModule
  ],
  exports:[
    LoginComponent

  ]
})
export class UsersModule { }
