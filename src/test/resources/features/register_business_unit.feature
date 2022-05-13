#Autor: Maileth Rivero Palacio


@stories

Feature: User registration Bussiness unit

  @RegistrateUnits

  Scenario: Mays registration a Business Unit on start website

    Given May has joined StartSharp
    When enter all requested information on business unit
      | strNameUser | strPassword | strNameNewBusinessUnit | strParentUnit  |
      | admin       | serenity    | Unidad                 | Administration |
    Then  registration is successfully completed
      | strNameNewBusinessUnit |
      | Unidad                 |
