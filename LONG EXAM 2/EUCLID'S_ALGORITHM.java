// EUCLIDEAN ALGORTIHM USING RECURSION
// Prepared by Gonzaga, Danga, and Bautista of COM221

// This program finds the GCD of two user-defined positive numbers using Euclidean Algorithm.

import java.util.Scanner;

public class Euclids_Algorithm {

	public static void main(String[] args) { // main method
		
		int fn, sn; // declaration of variables
		
		Scanner scan_input = new Scanner(System.in); // creation  of input scanner
		
			System.out.println("Good day!:) \nEuclidean Algorithm is a way to find the greatest common divisor \nof two positive integers, a and b.");
			System.out.println("\nEnter first number:"); //asks user to input value of first number
			fn = scan_input.nextInt();
			System.out.println("\nEnter second number:"); //asks user to input value of second number
			sn = scan_input.nextInt();
			//prints the GCD of positive integer input
			System.out.println("\nThe GCD of " + fn + " and " + sn + " is " + EuclidAlgorithm(fn,sn) + ".");
	}

	private static int EuclidAlgorithm(int a, int b) { // recursive method
		
		//base case 
		if(a==0)
    		return b;
		
		else // general case
    		return EuclidAlgorithm(b % a, a);
		
	}

}
