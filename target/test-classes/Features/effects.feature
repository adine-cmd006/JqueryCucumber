Feature:Effects Functions

  @smokeTest
  @effects
  Scenario:Add classes animation use
    Given User click Add Class button
    When User run effect
    Then User verify the effect change

  @regression
  @effects
  Scenario:Animate the properties of elements between colors use
    Given User click Color Animation button
    When User click Toggle Effect
    Then User displays what color used in animation

