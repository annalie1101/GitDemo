Feature: Application Login

@WebTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "jin" and password "1234"
Then Home page is populated
And Cards displayed: "true"

@MobileTest @WebTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "john" and password "4321"
Then Home page is populated
And Cards displayed: "false"

@WebTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following details
| jenny | abcd | john@abcd.com | Australia | 24275624 |
Then Home page is populated
And Cards displayed: "true"

@WebTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When Users login into application with username <Username> and password <Password>
Then Home page is populated
And Cards displayed: "true"

Examples:
| Username | Password |
| user1		 | pass1		|
| user2		 | pass2		|
| user3		 | pass3		|
| user4		 | pass4		|