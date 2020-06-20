Feature: Booking Test

  Scenario: Check lowest price
        Given I open booking.com
        When I find hotels in "Moscow" after 10 days for 5 days
        When I set guests by actions
        When I chose hotels with lowest price
        Then I compare lowest prices