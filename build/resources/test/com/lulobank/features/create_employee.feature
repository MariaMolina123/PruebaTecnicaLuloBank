Feature: Automatizacion de Api Rest

  Scenario Outline: Crear un usuario con metodo Post
    Given the actor establece la base url del servicio
    When proporciona la informacion del usuario
      | name   | <name>   |
      | salary | <salary> |
      | age    | <age>    |
    Then valida que la respuesta tenga el status code sea correcto
    Examples:
      | name           | salary | age|
      | Maria Molina   | 1250   | 23 |
      | Felipe Ramirez |        | 44 |



