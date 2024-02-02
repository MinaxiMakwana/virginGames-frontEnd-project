
@regression
Feature: Home page Join Now Test
  As a User I want to be able to click on Join Now link

  Background: User is on Homepage
    Given I am on home page

  @sanity @smoke
  Scenario: Verify user should navigate to each page successfully when user click on Join Now link
    When I click on live casino
    Then I verify text - Try Live Casino - Live Action Dealers & Selection of Games

