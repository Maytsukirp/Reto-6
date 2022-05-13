#Autor: Maileth Rivero Palacio


@stories

Feature: User registration a meeting

  @RegistrateMeeting

  Scenario: Mays registration a meeting on a unit

    Given May has joined StartSharp
    When enter all requested information in the meeting
      | strMeetingName | strMeetingType | strMeetingNumber | strStarDate | strStarDateHour | strEndDate | strEndDateHour | strLocation | strUnit        | strOrganized | strReporter | strAttendee  |
      | Monthly | General | 1 | 07/09/2022 | 08:00 | 07/09/2022 | 09:00 | HQ-01 | Administration | Allison Bell | James Jones | Alexis Lopez |
    Then  registration is completed
      | StrMeetingName |
      | Monthly |
