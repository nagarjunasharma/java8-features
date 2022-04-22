package com.nslearning.misc;

import java.util.StringJoiner;

public class StringJoinerExample {
	
	public static void main(String[] args) {
		
		// string joiner with delimiter
		StringJoiner names = new StringJoiner(",");
		names.add("Nithin");
		names.add("Sunil");
		names.add("Sita");
		names.add("Arun");
		names.add("Vidya");
		System.out.println(names);
		
		// string joiner with delimiter, prefix and suffix
		StringJoiner namesWithBrackets = new StringJoiner(",", "[", "]");
		namesWithBrackets.add("Nithin");
		namesWithBrackets.add("Sunil");
		namesWithBrackets.add("Sita");
		namesWithBrackets.add("Arun");
		namesWithBrackets.add("Vidya");
		System.out.println(namesWithBrackets);
		
		// merge two string joiners
		StringJoiner girls = new StringJoiner(",");
		girls.add("Divya");
		girls.add("Maya");
		girls.add("Angie");
		System.out.println(girls);
		StringJoiner boys = new StringJoiner(",");
		boys.add("Amit");
		boys.add("Joe");
		boys.add("Ben");
		System.out.println(boys);
		StringJoiner combinedNames = girls.merge(boys);
		System.out.println(combinedNames);
		
	}

}
