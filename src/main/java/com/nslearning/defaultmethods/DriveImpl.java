package com.nslearning.defaultmethods;

public class DriveImpl {
	
	public static void main(String[] args) {
		Drivable drive = () -> System.out.println("Musical Honk...");
		// default method within the interface
		drive.drive();
		// implemented through lambda function
		drive.honk();
		// static method within the interface
		Drivable.race();
	}
	
}
