Feature: Checking the hotel booking functionality of an Adactin application
@Login_Page
Scenario Outline: Login Functionality
Given user Must Launch The Url
When user Enter The "<username>" In The Username Field
And user Enter The "<password>" In The Password Field
Then user Click The Login Button And It Navigates the To the Serch Hotel Page

Examples:
|username|password|
|Guru|12345|
|Mownica|67890|
|YuvarajElumalai|12345678|