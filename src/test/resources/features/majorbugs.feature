#language en

@severity=critical
Feature: Major bugs

  @bug_969
  Scenario: Automatic value change
    Given  Go to the page "/c-etait-quoi-ce-titre"
    When   Select a date except today
    And    Select the time
    Then   No change of value in the date field
    But    Change of the value displayed in the date field to "Aujourd'hui"

  @bug_980
  Scenario: Host problem
    Given  Go to the page "/emissions/dress-code-street/vaccine-ready-la-tendance-qui-booste-la-mode-de-l-asymetrique"
    When   Scroll down and click on the instagram link
    Then   A white page is displayed mentioning a blocking at the level of the url

  @bug_987
  Scenario: Non-existent page
    Given Go to the page "/mouv-info/lena-situations-lance-une-bourse-etudiante-367704"
    When  Scroll down and click on "bourse Lena Situations"
    Then  The page we are looking is not found

  @bug_981
  Scenario: Bad host
    Given  Go to the page "/emissions/dress-code-street/20-ans-apres-retour-sur-le-phenomene-lara-croft"
    When   Scroll down and click on the youtube link
    Then   A white page is displayed mentioning a blocking at the level of the url