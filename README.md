# Projecto Empleado

Se ocupo Intellij Comunnity Edition para este desarrollo

-Para su ejecucion descargar todo el proyecto cuya carpeta es empleado y correr la clase EmployeeApplication

1-Para acceder a la interfaz de swagger es a traves del url:

 http://localhost:8080/swagger-ui.html

![pantalla principal de swagger](https://raw.githubusercontent.com/angelusm2003/Empleadotest/master/assets/swagger.png)

En ella se encuentran expuestos los metodos para el empleado en la opcion:

-application-controller: Application Controller
  
  Get / Employee
  
  Post / Employee
  
2-Para generar un token de acceso se debe utilizar la siguiente ruta:
http://localhost:8080/oauth/token

a)En el tipo de autorizacion se debe elegir: Basic Auth

b) El usuario es: usuario
   El password es: passw
   
![autorizacion basica](https://raw.githubusercontent.com/angelusm2003/Empleadotest/master/assets/token_autorizacion.png)
   
c) Los parametros son:
   username: angelr@correo.com
   password: password
   grant_type: password
   
![parametros del token](https://raw.githubusercontent.com/angelusm2003/Empleadotest/master/assets/token_parametros.png)

3-Para crear un nuevo empleado es a traves del url en el metodo POST:

http://localhost:8080/Employee

Se debe especificar un token valido (generado en el endpoint token) en headers como Authorization y como valor Bearer seguido del token , ejemplo:
Bearer 5859465e-8fe5-4789-92ba-8b90992b65ef

En el body la informacion con los parametros como aparecen en la imagen

![parametros del token](https://raw.githubusercontent.com/angelusm2003/Empleadotest/master/assets/post_employee.png)

Sino se proporciona un token valido se mandara un mensaje de error

![parametros del token](https://raw.githubusercontent.com/angelusm2003/Empleadotest/master/assets/token_novalido.png)

Si la informacion se envia con exito aparece en el response el resultado

![parametros del token](https://raw.githubusercontent.com/angelusm2003/Empleadotest/master/assets/token_valido.png)

4-Para visualizar todos los empleados registrados es a traves de la url en el metodo GET:

Se debe especificar un token valido (generado en el endpoint token) en headers como Authorization y como valor Bearer seguido del token , ejemplo:
Bearer 5859465e-8fe5-4789-92ba-8b90992b65ef

http://localhost:8080/Employee

![Mostrar todos los empleados](https://raw.githubusercontent.com/angelusm2003/Empleadotest/master/assets/empleados.png)
   



