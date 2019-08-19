package com.amdocs;

import javax.jws.WebService;

@WebService

public class Hello {
	
	public String sayHello() {
		return "Hello SOAP API!";
	}

}
