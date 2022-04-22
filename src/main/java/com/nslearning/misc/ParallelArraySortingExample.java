package com.nslearning.misc;

import java.util.Arrays;

public class ParallelArraySortingExample {
	
	public static void main(String[] args) {
		int[] numbers = {3,2,5,1,7,6,9,0};
		System.out.println("Initial Array : ");
		for(int i: numbers) {
			System.out.println(i + " ");
		}
		// Sort Array 
		System.out.println("Sorted Array : ");
		Arrays.parallelSort(numbers);
		for(int i: numbers) {
			System.out.println(i + " ");
		}
	}

}
