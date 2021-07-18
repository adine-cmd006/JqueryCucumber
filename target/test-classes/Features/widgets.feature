Feature:widgets sections

  @regression
  @widgets
  Scenario:Displays collapsible content panel use
    Given User click Accordion button
    When User click random section
    Then User shows the content of the section

  @widgets
  Scenario:AutoComplete use
    Given User click Autocomplete button
    When User type into the field
    Then User check if the text are in tags field

  @widgets
  Scenario:Buttons use
    Given User click Button button
    When User clicks the buttons
    Then User check if the buttons is clicked

  @regression
  @widgets
  Scenario:CheckBoxRadio use
    Given User click CheckBoxRadio button
    When User click checkboxes on each group
    Then User check if the checkboxed are selected

  @widgets
  Scenario:ControlGroup use
    Given User click ControlGroup button
    When User select the each option
    Then User book the car

  @smokeTest
  @widgets
  Scenario:DatePicker use
    Given User click DatePicker button
    When User select the date
    Then User check if the date is selected

  @widgets
  Scenario:Dialog window use
    Given User click Dialog button
    When User closed the dialog button
    Then User check if dialog is closed

  @widgets
  Scenario:Menu use
    Given User click menu button
    When User order classic rock music
    Then User check if selected correct music

  @widgets
  Scenario:Progressbar use
    Given User click Progressbar button
    When User check status of Progressbar
    Then User displays status of Progressbar

  @widgets
  Scenario:Slider use
    Given User click Slider button
    When User Slide the slider to the end
    Then User check if the slider is at the end

  @widgets
  Scenario:Tooltip use
    Given User click into Tooltip button
    When User Selects Tooltips
    Then User Displays the tooltips information

