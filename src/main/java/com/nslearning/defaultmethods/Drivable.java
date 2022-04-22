package com.nslearning.defaultmethods;

public interface Drivable {
	// default method
	default void drive() {
		System.out.println("I am driving");
	}
	
	// static method
	static void race() {
		System.out.println("I am racing...");
	}
	
	void honk();
}
