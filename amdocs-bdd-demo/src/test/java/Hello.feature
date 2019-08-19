Feature: Develp Hello World Java application.
	Scenario: should be able to invoke sayHello greeting method
		Given I have created a hello object
		When I invoke the say Hello method on the hello object
		Then I expect the response as "Hello BDD!"
