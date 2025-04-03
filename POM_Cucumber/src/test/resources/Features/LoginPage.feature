Feature: Login to HRM application
@validDetails
Scenario: Login with valid details
	Given the user is on Orange HRM Login page "https://opensource-demo.orangehrmlive.com/"
	When user enter username and password
	Then the user shold be able to login sucessfully and new page open