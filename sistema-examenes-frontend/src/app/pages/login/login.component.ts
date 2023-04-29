import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { LoginService } from '../../services/login/login.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginData= {
    "username": "",
    "password": ""
  }

  constructor(private snack:MatSnackBar,private loginService:LoginService,private router:Router) { }

  ngOnInit(): void {
  }

  formSubmit(){
    if(this.loginData.username.trim() == '' || this.loginData.username.trim() == null){
      this.snack.open('El nombre de usuario es requerido !!','Aceptar',{
        duration:3000
      })
      return;
  }

  if(this.loginData.password.trim() == '' || this.loginData.password.trim() == null){
    this.snack.open('La contraseña es requerida !!','Aceptar',{
      duration:3000
    })
    return;
  }

  this.loginService.generateToken(this.loginData).subscribe(
    (data:any)=>{
      console.log(data);
    }, (Error)=>{
      console.log(Error);
      this.snack.open('Detalles inválidos , vuelva a intentar !!','Aceptar',{
        duration:3000
      })
    }

  )

}
}
