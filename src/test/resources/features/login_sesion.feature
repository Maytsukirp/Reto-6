#Autor: Maileth Rivero Palacio

@stories

Feature: User registration

  @LoginSesion
  Scenario: May want login sesion

    Given May login to the StartSharp
    When She has entered the credentials
      | strNameUser | strPassword |
      | admin       | serenity    |
    Then Login is successful
      | StrTextStartSharp |
      | StartSharp        |