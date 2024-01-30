@Regression
Feature: Slider

  Background:
    Given Ingreso en la pagina demoqa
    When Ingreso a la seccion de slider

  @SliderSuccess
  Scenario: Funcionamiento slider correctamente
    And Posiciono el punto
    Then Valido el valor de la posicion actual
