package com.amdocs;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(100);
		numbers.add(200);
		numbers.add(50);
		numbers.add(500);
		System.out.println("size of array is " + numbers.size());
		System.out.println("List elements are...");
		for(int element:numbers) {
			System.out.println(element);
		}
		Collections.sort(numbers);
		System.out.println("size of array is " + numbers.size());
		for(int element1:numbers) {
			System.out.println(element1);
		}
		
		
	}

}
