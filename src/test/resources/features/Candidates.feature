#Author: winesofindiaeric@gmail.com
Feature: Recruit Candidate

  Background: 
    Given I login into OrangeHRM
    When I click Recruitment Module and click Candidates

  Scenario: As an admin, I should have the ability to add Candidates
    And Click Add
    And Enter First, Middle, Last Name
    And Enter Email and Contact No
    Then I see Job Vacancy is displayed
    And I enter any Keywords and any Comments
    And I select a Date Of Application
    And I click Save
    Then I see Candidate appears in Candidates History
    
  Scenario: As an Admin, I should see candidate present
    And I Select All from Job Title
    And I Select All from Vacancy
    And I Select All from the Hiring Manager
    And I Select All from Status
    And I Enter Candidates Name from the previous entry
    And Select Date of Application from the previous entry
    And Select Methods of Application to Manual
    And Click Search
    Then I see Candidate is present
