package com.nslearning.functionalinterfaces;

public class WorkImpl {
	
	public static void main(String[] args) {
		// Functional Interface instantiation with Lambda Expression
		Workable w = () -> System.out.println("I am working...");
		w.work();
		
		// Functional Interface extend from a non functional interface with only default method in it
		OfficeWorkable ow = () -> System.out.println("Doing Office Work...");
		ow.work();
		ow.defaultWork();
	}

}
