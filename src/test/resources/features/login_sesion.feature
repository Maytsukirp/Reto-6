#Autor: Maileth Rivero Palacio

@stories

Feature: User Login Sesion

  @LoginSesion
  Scenario: May want login sesion

    Given May enters to StartSharp
    When She has entered the credentials
      | strNameUser | strPassword |
      | admin       | serenity    |
    Then Login is successful
      | StrTextStartSharp |
      | StartSharp        |