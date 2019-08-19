package com.amdocs;

import java.util.ArrayList;

public class PaperWala implements IObservable {
	private ArrayList<IObserver> subscribers;
	

	public void addSubscriver(IObserver observer) {
		subscribers.add(observer);

	}

	public void removeSubscriver(IObserver observer) {
		subscribers.remove(observer);
	}

	public void notifyAllSubscrivers() {
		for(IObserver customer : subscribers)
			customer.update( message);

	}

}
