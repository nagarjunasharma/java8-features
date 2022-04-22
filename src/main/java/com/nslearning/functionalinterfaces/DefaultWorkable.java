package com.nslearning.functionalinterfaces;

public interface DefaultWorkable {

	default void defaultWork() {
		System.out.println("Default work!");
	}
}
