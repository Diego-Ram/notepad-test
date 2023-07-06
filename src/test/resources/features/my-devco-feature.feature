#author: Diego Ramirez

Feature: el usuario ejecuta acciones en la pagina de notepad online

  @test1
  Scenario: Crear una nota de texto enriquecido con letra en negrita
    Given el usuario ingresa a la pagina de notepad
    When el usuario crea una nota con letras en negrilla
    Then el usuario valida Texto en negrilla