@tag
Feature: To verify whether application allows admin to create career, promotion & subscribe session to promotion
Scenario: Create, promote and subscribe by Admin
Given User should launched the application
When User should login with admin credential as "admin" and "admin@123"
And Click on Administration tab
And click on Careers and promotions link
And click on careers icon
And click on Add icon
And enter valid credentials in Name textbox
And Click on Add button
And click on Careers and promotions link
And click on Promotions icon
And click on Add icon
And enter valid promotion credentials in Name textbox
And Click on the Add button
And click on subscribe sessions to promotion icon
And select session in Sessions not subscribed  window
And click on arrow
And click on subscribe sessions in promotion window button
Then session should get added into promotion
