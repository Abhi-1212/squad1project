Feature:  USer login
Scenario: USer loogged in with valid user name
Given User navigates to squad1 login page
When USer entered valid email "abhishek.yad@1212"
And User enteered invalid email "sakdjsa"
Then USer Click on submit button
