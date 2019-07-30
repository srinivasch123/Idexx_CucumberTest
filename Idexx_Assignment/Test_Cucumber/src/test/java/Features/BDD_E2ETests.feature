Feature: Search for hotel in Singapore
  Description: The purpose of the test is to search for a hotel in singapore.

  @Search
  Scenario Outline: User searches for Rendezvous hotel in Singapore
    Given user is on the home page on "<environment>" and "<browser>"
    When searches for hotel using "<location>", "<checkIn>", "<checkOut>" and "<noofadults>"
    Then search succeeds
#    And user can see the price of Junior suite
#    And user can see the reviews from people

    Examples:
    |environment|browser|location|checkIn|checkOut|noofadults|price|
    |saucelabs|Chrome|Singapore|5    |10    |2              |1250$|