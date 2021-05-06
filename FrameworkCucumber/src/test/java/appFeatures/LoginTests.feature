Feature: Como usuario registrado en la aplicacion
deseo iniciar sesion 
con el fin de realizar compras


Scenario: iniciar sesion
Given usuario comprador esta en la pagina de inicio de sesion
When el usuario ingresa su correo electronico "andrea.prueba@mail.com" 
And el usuario ingresa su password "123456" 
Then se inicia la sesion

