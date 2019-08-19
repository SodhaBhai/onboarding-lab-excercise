package com.amdocs;

public class Steps {
	
	private String soapWSDLURL;
	private String rpnMathExpression;
	private double actualResult;
	
	@Given("I have deployement the RPNCalculator SOAP api at URL {string}")
	public void i_have_deployement_the_RPNCalculator_SOAP_api_at_URL_http_localhost_rpncalculator_ws_services_rpncalculator_wsdl(Integer int1) {
	    soapWSDLURL = wsdlURL;
	}

	@Given("the input is {string}")
	public void the_input_is(String string) {
	    this.rpnMathExpression = rpnMathExpression;
	}

	@When("I invoke the SOAP API")
	public void i_invoke_the_SOAP_API() {
	    RPNCalculatorSoap rpnWebService = new RPNCalculatorSoap();
	    
	    RPNCalculator rpnCalculator = rpnWebService.getRPNCalculator();
	    actual Result = rpnCalculator.evaluate(rpnMathExpression);
	}

	@Then("I expect the response as {string}")
	public void i_expect_the_response_as(String expectedResult) {
		assertEquals(expectedResult,actualResult);
	    
	}
}
