Feature: Search 
As a user
I want to search in home page of the website
So that I can perform search operation for a fooditem.

 Scenario Outline: To verify that the given item is displayed on search
    Given The McDonald's User can search desired food item on search bar
    When The user enters the "<fooditem>"
    Then The page should generate food items related to that search

 
    Examples: 
      | fooditem |
      | Veg Burger |
      | Chicken Nuggets |
      
