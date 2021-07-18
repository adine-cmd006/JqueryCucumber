Feature:Interactions Section
  @regression
  @interactions
  Scenario:Draggable function use
    Given User click draggable button
    When User drag the element to the XAndYLocation
    Then User verify if drag item is on the XAndYLocation

  @smokeTest
  @interactions
  Scenario:Droppable function use
    Given User click droppable button
    When User drag the element and drop the element
    Then User verify if drag item is on drop element

  @interactions
  Scenario: Resizable function use
    Given User click resizable button
    When User resize the element to the point
    Then User verify if resize item is on point
  @regression
  @interactions
  Scenario: Selectable function use
    Given User click selectable button
    When User select random items
    Then User verify if items are selected

  @interactions
  Scenario: Sortable function use
    Given User click sortable button
    When User sort the element randomly
    Then User print changed item list