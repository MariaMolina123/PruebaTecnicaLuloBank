Feature: Automatizacion de Api Rest

  Scenario: Consultar informacion de usuario exitoso
    Given the actor establece la base url del servicio
    When consulta en el endpoint por id "32"
    Then valida que el status code sea exitoso

  Scenario: Consultar informacion de usuario exitoso
    Given the actor establece la base url del servicio
    When consulta en el endpoint por id "450"
    Then valida que el status code sea exitoso y data llegue vacio