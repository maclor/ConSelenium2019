#Auto generated Octane revision tag
@TID4001REV0.2.0
Feature: Ability to logout

	Scenario: Ability to logout
		Given logged in user
		When he logs out
		Then his account should be secured
