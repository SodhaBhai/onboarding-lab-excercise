package com.amdocs;

public class Main {

	public static void main(String[] args) {
		
		PaperWala paperWala = new PaperWala("Pune PaperWala Pvt Ltd.");
		paperWala.addSubscriver(new Subscriber("Ramesh"));
		
		paperWala.notifyAllSubscribers("Times Of India")
	}
}
