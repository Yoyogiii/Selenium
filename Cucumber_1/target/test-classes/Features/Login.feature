Feature: Testing OrangeHRM

Scenario: To Test the Login Page of OrangeHRM

Given User Should In the Login Page

When Enter The Valid UserName "Admin"

And Enter the VAlid Password  "admin123"
And Click ON Login button

Then I Should Get the Title  "OrangeHRM"