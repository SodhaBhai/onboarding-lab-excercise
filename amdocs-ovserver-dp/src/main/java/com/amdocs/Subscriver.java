package com.amdocs;

public class Subscriver implements IObserver {

	public void update(String message) {
		System.out.println(message);
	}

}
