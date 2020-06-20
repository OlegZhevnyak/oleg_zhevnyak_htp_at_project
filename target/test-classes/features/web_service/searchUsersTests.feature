Feature: Search user test
1 scenario - Search user by partial short name
2 scenario - Search user by partial long name
3 scenario - Search user by full short name
4 scenario - Search user by full long name
5 scenario - Search all users

  Scenario Outline: 1 - 5 scenarios
      When I send request "<request>"
      When I get response
      When I parse response
      When I parse expected result "<result>"
      Then I compare expected result and response

Examples:
| request | result |
| src/test/resources/test_data/web_service/requests/search_by_partial_short_name_request.json | src/test/resources/test_data/web_service/expected/search_by_partial_short_name_expected.json |
| src/test/resources/test_data/web_service/requests/search_by_partial_long_name_request.json | src/test/resources/test_data/web_service/expected/search_by_partial_long_name_expected.json |
| src/test/resources/test_data/web_service/requests/search_by_full_short_name_request.json | src/test/resources/test_data/web_service/expected/search_by_full_short_name_expected.json |
| src/test/resources/test_data/web_service/requests/search_by_full_long_name_request.json | src/test/resources/test_data/web_service/expected/search_by_full_long_name_expected.json |
| src/test/resources/test_data/web_service/requests/search_all_users_request.json | src/test/resources/test_data/web_service/expected/search_all_users_expected.json |