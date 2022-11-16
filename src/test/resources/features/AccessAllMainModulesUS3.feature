Feature: verifying access to all main modules
  User story As a user, I should be accessing all the main modules of the app

  @wip
  Scenario Outline:Verify users accessing all the main modules of the app
    Given user on the login page
    When user use enter "<username>" and enter "<password>"
    Given user on the login page
    Then Verify the user see the following modules:
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |



    Examples:
      | username | password    |
      | User23   | Userpass123 |
      | User53   | Userpass123 |
      | User83   | Userpass123 |
      | User113  | Userpass123 |