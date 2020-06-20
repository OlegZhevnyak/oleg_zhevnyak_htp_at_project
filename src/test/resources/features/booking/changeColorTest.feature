Feature: Booking Test

  Scenario: Change hotel name color
      Given I open booking.com
      When I find hotels in "Oslo" after 1 days for 1 days
      When I find hotels for 2 adults, 1 children and 1 room
      When I chose hotels with three and four stars
      When I scroll to tenth hotel
      When I change hotel name to "red"
      Then I check that hotel name changed to "red"
      When I change hotel name to "green"
      Then I check that hotel name changed to "green"