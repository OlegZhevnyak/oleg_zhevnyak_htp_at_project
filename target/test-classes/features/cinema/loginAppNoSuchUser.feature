Feature: Cinema

Scenario: Login app no such user
Given I open an app
When I login with "login@gmail.com" and "password"
Then I see "Пользователь не найден" message