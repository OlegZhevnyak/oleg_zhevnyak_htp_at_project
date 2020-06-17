Feature: Booking Test

  Scenario: Check Header Elements Exist
      Given I open booking.com
      When I LogIn as a existing user
      Then I check that Booking logo exist
      Then I check that Currency link exist
      Then I check that Language link exist
      Then I check that Help Centre link exist
      Then I check that List Your Property link exist
      Then I check that Your Account link exist
      Then I check that Stays tab exist
      Then I check that Flights tab exist
      Then I check that Car rentals tab exist
      Then I check that Attraction tab exist
      Then I check that Airport tab exist