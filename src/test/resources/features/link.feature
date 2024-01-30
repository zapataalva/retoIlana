@Regression
Feature: Validacion enlaces

  Background:
    Given Ingreso en la pagina demoqa
    When Ingreso a la seccion de links

  @successLinkWithOutRedirection
  Scenario Outline: Validacion enlaces sin redireccion
    Then Valido el <link> y verifico el valor esperado <expected>
    Examples:
      | link           | expected                                                              |
      | "Created"      | "Link has responded with staus 201 and status text Created"           |
      | "No Content"   | "Link has responded with staus 204 and status text No Content"        |
      | "Moved"        | "Link has responded with staus 301 and status text Moved Permanently" |
      | "Bad Request"  | "Link has responded with staus 400 and status text Bad Request"       |
      | "Unauthorized" | "Link has responded with staus 401 and status text Unauthorized"      |
      | "Forbidden"    | "Link has responded with staus 403 and status text Forbidden"         |
      | "Not Found"    | "Link has responded with staus 404 and status text Not Found"         |

  @successLinkWithRedirection
  Scenario Outline: Validacion enlaces con redireccion
    Then Valido el <link> y verifico la redireccion <title>
    Examples:
      | link          | title    |
      | "simpleLink"  | "DEMOQA" |
      | "dynamicLink" | "DEMOQA" |