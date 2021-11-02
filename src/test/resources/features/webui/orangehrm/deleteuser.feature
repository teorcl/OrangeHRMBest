Feature: Eliminando usuario creado previamente
  Como usuario admin
  quiero eliminar un usuario de la plataforma de  orangeHRM que haya terminado su contrato
  para mantener la base de datos actualizada


  Scenario: eliminar un usuario de la plataforma.
    Given que el admin se encuentra autenticado en el sitio de orangeHRM
    When el admin quiere eliminar a un usuario
    Then el sistema deberia eliminarlo de la tabla.