Feature: Realizacion de casos ingresando nombre de usuario y contraseña además de ingresar una agenda
 
Scenario: Verificacion de ingreso de sesion
Given abrir navegador
When ingresar nombre de usuario "user" y contrasenha "user"
Then iniciar sesion

Scenario: Verificacion de ingreso de sesion fallido
Given abrir navegador
When ingresar nombre de usuario "user" y contrasenha "qwerty"
Then iniciar sesion

Scenario: Registro de hora medica veterinaria a partir de prueba Junit
Then ejecutar test