Feature: Automatizacion de Api Rest

  Scenario: Eliminar  de usuario exitoso
    Given the actor establece la base url del servicio
    When elimina en el endpoint por id "2"
    Then valida que el status code sea exitoso

  Scenario: Eliminar  de usuario fallido
    Given the actor establece la base url del servicio
    When elimina en el endpoint por id "2"
    Then valida que el status code sea fallido
