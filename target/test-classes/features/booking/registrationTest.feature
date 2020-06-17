Feature: Booking Test
DUMMY_EMAIL_1 = "trinity.abshire26@0box.eu";     since 17.06.20

  Scenario: Check registration
          Given I open booking.com
          When I register new account "georgiana_orn@0box.eu"
          When I confirm registration
          When I open dashboard
          Then I check that ConfirmBanner is not present