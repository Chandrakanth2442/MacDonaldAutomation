Feature: cart
Scenario: To verify that the items & customizations are able to add into the cart. 
Given The McDelivery homepage
When user click on the Add button to keep the item in cart
Then user should be able to choose the customizations 
And click on Add to cart
When user click on the view cart button
Then user should view the order details.