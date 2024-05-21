Feature: Get all Products
    As a User
    I want to get product rating
    So that I can choose the products that I wanted to buy

    Scenario: Get product rating
        Given I set the API Endpoint to get product rating
        When I send the request to get product rating
        And I get status code 200 after request to get product rating
        Then I receive all product rating