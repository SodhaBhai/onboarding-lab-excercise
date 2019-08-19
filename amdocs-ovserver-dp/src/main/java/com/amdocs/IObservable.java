package com.amdocs;

public interface IObservable {
	public void addSubscriver(IObserver observer);
	public void removeSubscriver(IObserver observer);
	public void notifyAllSubscrivers();
}
