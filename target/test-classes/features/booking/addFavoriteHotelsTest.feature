Feature: Booking Test

  Scenario: Add two favorite hotels
      Given I open booking.com
      When I LogIn as a existing user
      When I find hotels in "Madrid" after 0 days for 30 days
      When I find hotels for 2 adults, 0 children and 1 room
      When I add first and last hotel to favorites from the appears list
      Then I check that first and last hotel favorite buttons should be red
      When I Open my wish list
      Then I check that two selected hotels should be added to wish list