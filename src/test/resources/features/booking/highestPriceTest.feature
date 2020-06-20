Feature: Booking Test

  Scenario: Check highest price
      Given I open booking.com
      When I find hotels in "Paris" after 3 days for 7 days
      When I find hotels for 4 adults, 0 children and 2 room
      When I chose hotels with highest price
      When I sort hotels by lowest price
      Then I compare highest prices