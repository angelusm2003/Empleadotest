# Projectto Empleado

Se ocupo Intellij Comunnity Edition para este desarrollo

-Para su ejecucion descargar todo el proyecto y correr la clase EmployeeApplication

-Para acceder a la interfaz de swagger es a traves del url:

 http://localhost:8080/swagger-ui.html

![pantalla principal de swagger](https://raw.githubusercontent.com/angelusm2003/Empleadotest/master/assets/swagger.png)

En ella se encuentran expuestos los metodos para el empleado en la opcion:

-application-controller: Application Controller
  
  Get / Employee
  
  Post / Employee
  
-Para generar un token de acceso se debe utilizar la siguiente ruta:
http://localhost:8080/oauth/token

a)En el tipo de autorizacion se debe elegir: Basic Auth

b) El usuario es: usuario
   El password es: passw
   
c) Los parametros son:
   username: angelr@correo.com
   password: password
   grant_type: password

-Para crear un nuevo empleado es a traves del url en el metodo POST:

http://localhost:8080/Employee

Se debe especificar en el body la informacion con los parametros como aparecen en la imagen

![Informacion enviada](https://raw.githubusercontent.com/angelusm2003/Empleadotest/master/assets/post_employee.png)

-Para visualizar todos los empleados registrados es a traves de la url en el metodo GET:

http://localhost:8080/Employee


   



