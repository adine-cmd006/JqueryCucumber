Feature:utilities functions
  @regression
  @utilities
  Scenario:Position the element use
    Given User click Position button
    When User get the location of position
    Then User verify if the position location changed

  @smokeTest
  @utilities
  Scenario:Widget Factory use
    Given User click Widget Factory button
    When User selects Go green button
    Then User change the color and check if it is still green