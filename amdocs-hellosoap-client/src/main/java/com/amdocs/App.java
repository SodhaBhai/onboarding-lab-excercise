package com.amdocs;

public class App {

	public static void main(String[] args) {
		
		//System.setProperty("java.net.useSystemProxies","true");
		HelloService  service = new HelloService();
		Hello hello = service.getHello();
		System.out.println(hello.sayHello());

	}

}
