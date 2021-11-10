Feature: Crear una nueva vacante
  Como usuario admin quiero crear una nueva vacante para
  generar nuevos puestos de trabajo

  Scenario: Crear nueva vacante
    Given que el usuario admin se encuentra logueado como admin
    When el admin quiere crear una nueva vacante e ingresa los datos necesario
    Then el admin deberia ver la nueva vacante