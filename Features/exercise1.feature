Feature: Test login functionality
Description: Registered user can use login credentials to get logged in to the testmeapp
username - lalitha
password - password123

Scenario: Test login with valid credentials
Given user opens testmeapp
When user enters username as "lalitha"
When user enters password as "password123"
When user clicks login button
And verify login success
Then close testmeapp