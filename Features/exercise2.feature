Feature: Test search fumctionality

Scenario Outline: Search for Laptop
Given user logsin the app
When user searches for "<item>"
Then user logs out

#Scenario: Search for TravelKit
#Given user logsin the app
#When user searches for "TravelKit"
#Then user logs out

Examples:
|item|
|laptop|
|Travelkit|