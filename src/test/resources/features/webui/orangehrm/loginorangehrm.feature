Feature: Login en el sitio web Orange HRM
  Como empleado admin quiero ingresar al sitio web
  para hacer las  modificaciones requeridas.

  Scenario: login en OrangeHRM
    Given que el empleado admin se encuentra la pagina de logueo del sitio web OrangeHRM
    When el admin ingresa las credenciales correctas y confirma la accion
    Then el admin deberia ver un boton con la palabra Dashboard