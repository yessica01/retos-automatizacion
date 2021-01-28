# language: es
#Author: yessica rodriguez

@tag
Característica: Registro de usuario en utest
  Yo como futuro usuario de utest
  Quiero poder registrarme en la página 
  Para luego poder iniciar como usuario registrado

   Antecedentes: 
   Dado que yessica ingresa a la pagina principal de utest
 
 
  @tag1
  Escenario: Ingresar información para el registro
    Cuando realiza el proceso de registro para un usuario nuevo
    Entonces deberia ver su registro fue exitoso

 
#  @tag1
  #Esquema del escenario: Ingresar información de ubicación
  #  Dado que yessica ingresa a la pagina principal de utest
  #  Cuando se dirige a la opcion para registrarse
  #  Y completa el primero formulario con la informacion personal
   # |primerNombre     |apellido   |correo     |fechaDeNacimiento    |
  #  |<nombre>         |<apellido> |<correo>   |<fechaDeNacimiento>  |
  #  Entonces deberia ver su registro fue exitoso
  
  #Ejemplos:   
  # |nombre  |apellido  |correo                   |fechaDeNacimiento  |	
  # |yessica |rodriguez |yarodriguez212@gmail.com |10-01-1996         |
 
 
