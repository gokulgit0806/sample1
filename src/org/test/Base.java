package org.test;

public class Base {
public static void main(String[] args) {
	// Variable to store the sum of all even numbers
	int sum = 0;

	for(int i = 10; i <= 100; i++){
		if(i % 2 == 0) {	// Checks if i is even
			sum += i; // The same as sum = sum + i
		}
	}

	// Prints the sum
	System.out.println(sum);
}
}

