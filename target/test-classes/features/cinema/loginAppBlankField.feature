Feature: Cinema

Scenario: Login app blank field
Given I open an app
When I left blank "" field
Then I see message "Необходимо заполнить поле \"E-mail\""