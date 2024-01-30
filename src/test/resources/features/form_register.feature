@Regression
Feature: Formulario de registro

  @successRegister
  Scenario: Registro exitoso
    Given Ingreso en la pagina demoqa
    When Ingreso a la seccion formulario de practica
    And Ingreso la información de registro
    Then Se evidencia el mensaje "Thanks for submitting the form"
    And Se evidencia la información del registro