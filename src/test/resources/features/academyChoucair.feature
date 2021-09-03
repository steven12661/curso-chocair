
@stories
Feature: Academy Choucair
  As user, I Want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than jeff wants to learn automation at the academy Choucair
      | strUser     | strPassword    |
      | 1152713076  | Choucair2021*  |
    When he search for the course on the choucair academy platform
      | strCourse          |
      | Metodologia Bancolombia |
    Then he finds the course called resources Metodología Bancolombia
#    Then he finds the course called
#      | strCourse          |
#      | Metodologia Bancolombia |