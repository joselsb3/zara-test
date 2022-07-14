Feature: meme feature

  Scenario Outline: A api user gets the price of a product
    Given a date <date>
    And a brand
      | 1 |
    And a product
      | 35455 |
    When call prices api rest
    Then the response has the following attributes <body>
    Examples:
      | body | date |
      |  "{ \"brand_id\": 1, \"product_id\": 35455, \"price_list\": 1, \"price\": 35.50, \"curr\": \"EUR\", \"start_date\": \"2020-06-14T00:00:00\" , \"end_date\": \"2020-12-31T23:59:59\" }" | "2020-06-14-10.00.00" |
      |  "{ \"brand_id\": 1, \"product_id\": 35455, \"price_list\": 2, \"price\": 25.45, \"curr\": \"EUR\", \"start_date\": \"2020-06-14T15:00:00\" , \"end_date\": \"2020-06-14T18:30:00\" }" | "2020-06-14-16.00.00" |
      |  "{ \"brand_id\": 1, \"product_id\": 35455, \"price_list\": 1, \"price\": 35.50, \"curr\": \"EUR\", \"start_date\": \"2020-06-14T00:00:00\" , \"end_date\": \"2020-12-31T23:59:59\" }" | "2020-06-14-21.00.00" |
      |  "{ \"brand_id\": 1, \"product_id\": 35455, \"price_list\": 3, \"price\": 30.50, \"curr\": \"EUR\", \"start_date\": \"2020-06-15T00:00:00\" , \"end_date\": \"2020-06-15T11:00:00\" }" | "2020-06-15-10.00.00" |
      |  "{ \"brand_id\": 1, \"product_id\": 35455, \"price_list\": 4, \"price\": 38.95, \"curr\": \"EUR\", \"start_date\": \"2020-06-15T16:00:00\" , \"end_date\": \"2020-12-31T23:59:59\" }" | "2020-06-16-21.00.00" |









