#language en

@severity=minor
Feature: Minor bugs
    
  @recommandation_977
  Scenario: Remaining menu
    Given Go to the homepage
    And   Scroll down to the footer and click on "Grille des programmes"
    When  Click on the antenna symbol of one program
    And   Click on the antenna symbol of another program
    Then  The drop-down menu for the first program should disappear
    But   The drop-down menus remain opened on all selected programs

  @recommandation_972
  Scenario: Missing content
    Given  Go to the page "/animateurs"
    When   Click on "Ahmed"
    Then   No content in the section "Dernières News"

  @recommandation_966
  Scenario: Update the copyright
    Given Go to the homepage
    When Scroll down to the footer
    Then The copyright should be updated to the current year
    But Mouv's copyright is dated 2018

  @bug_968
  Scenario: Wrong redirection
    Given Go to the homepage
    When  Scroll down to the footer and click on "Assistants vocaux"
    And   Scroll down and click on "Skill Mouv'"
    Then  The page is not found

