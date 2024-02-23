Feature: Location
Background:
Given The User is on MacD application
Scenario Outline: To verify address bar is accepting address
When the user enters the "<location>"
Then the map should redirect to the given changed location.
Examples:
| location |
| Hitech City Hyderabad |
| Gajwel |

