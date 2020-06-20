Feature: Cinema

Scenario: Search movie
Given I open an app
When I search for "зоопарк" word
Then I see the list of movie items
And Each item name or description contains "зоопарк"