#Autor: Maileth Rivero Palacio



    @RegistrateUnits
    Scenario: Mays registration on start website

      Given May wants to register unity on the Start website
      When enter all requested information
        | strNameUser | strPassword | strNameNewBusinessUnit | strParentUnit  |
        | admin       | serenity    | Unidad                 | Administration |
      Then  registration is successfully completed
        | strNameNewBusinessUnit |
        | Unidad                 |

    @RegistrateMeeting
    Scenario: Mays registration a meeting on a unit

      Given May wants to register a meeting on a unit
      When enter all requested information in the meeting
        | strMeetingName | strMeetingType | strMeetingNumber | strStarDate | strStarDateHour | strEndDate | strEndDateHour | strLocation | strUnit        | strOrganized | strReporter | strAttendee  |
        | Monthly        | General        | 1                | 07/09/2022  | 08:00           | 07/09/2022 | 10:00          | HQ-01       | Administration | Allison Bell | James Jones | Alexis Lopez |
      Then  registration is completed
        | StrMeetingName |
        | Monthly        |
