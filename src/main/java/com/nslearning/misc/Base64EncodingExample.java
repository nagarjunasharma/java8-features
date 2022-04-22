package com.nslearning.misc;

import java.util.Base64;

public class Base64EncodingExample {
	
	public static void main(String[] args) {
		// encodeing / decoding string example
		String encodedString = Base64.getEncoder().encodeToString("Hello from Java 8\nWelcome!".getBytes());
		System.out.println("Encoded String : " + encodedString);
		
		String decodedString = new String(Base64.getDecoder().decode(encodedString));
		System.out.println("Decoded String : " + decodedString);
		
		// encoding/decoding url example
		String encodedURL = Base64.getUrlEncoder().encodeToString("http://www.google.com".getBytes());
		System.out.println("Encoded URL : " + encodedURL);
		
		String decodedURL = new String(Base64.getUrlDecoder().decode(encodedURL));
		System.out.println("Decoded URL : " + decodedURL);
	
		// encoding/decoding MIME (Multi-Purpose Internet Message Extensions) messages
		String encodedMimeMessage = Base64.getMimeEncoder().encodeToString("Hello,\nThis is from Java 8!\nA MIME Message!!!".getBytes());
		System.out.println("Encoded MIME Message : " + encodedMimeMessage);
		
		String decodedMimeMessage = new String(Base64.getMimeDecoder().decode(encodedMimeMessage));
		System.out.println("Decoded MIME Message : " + decodedMimeMessage);
		
	}

}
