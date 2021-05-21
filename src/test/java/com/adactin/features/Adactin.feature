Feature: Hotel Booking in Adactin Application
@smokeTest
Scenario Outline: LogIn

Given User Launch Url

When User Enters "<UserName>" UserName

And User Enters  "<PassWord>" PassWord

Then User click Login Button And it Navigates To Search Hotel Page
Examples:
|Suresh Prashanth|Msdrsp07|

Scenario: Search Hotel

When User Select Location

And User Select Hotel 

And User Select Search RoomType

And User Select Search Number Of Rooms

And User Enter In-Date

And User Enter Out-Date

And User Select Adults Per Room

And User Select Children Per Room

Then User Click Search


Scenario: Search Hotel From Given Option

When User Select Any Hotel

Then User Click Continue


Scenario: Book Hotel

When User Enter First Name

And User Enter last Name

And User Enter Address

And User CreditCard Number

And User Select CreditCard Type

And User Select Expiry Month

And User Select Expiry Year

And User Enter CVV Number

Then User Click Submit Button





