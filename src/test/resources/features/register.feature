#Autor: Maileth Rivero Palacio


@stories

Feature: User registration Bussiness unit and meeting

  Background:

    Given May has joined StartSharp

    @RegistrateUnits
    Scenario: Mays registration a Business Unit on start website

      When enter all requested information on business unit
        | strNameUser | strPassword | strNameNewBusinessUnit | strParentUnit  |
        | admin       | serenity    | Unidad                 | Administration |
      Then  registration is successfully completed
        | strNameNewBusinessUnit |
        | Unidad                 |

    @RegistrateMeeting
    Scenario: Mays registration a meeting on a unit

      When enter all requested information in the meeting
        | strMeetingName | strMeetingType | strMeetingNumber | strStarDate | strStarDateHour | strEndDate | strEndDateHour | strLocation | strUnit        | strOrganized | strReporter | strAttendee  |
        | Monthly        | General        | 1                | 07/09/2022  | 08:00           | 07/09/2022 | 09:00          | HQ-01       | Administration | Allison Bell | James Jones | Alexis Lopez |
      Then  registration is completed
        | StrMeetingName |
        | Monthly        |
