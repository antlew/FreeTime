package com.freelance.calculator;

import java.util.Scanner;

public class DumbCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double firstInput;
		double secondInput;
		
		System.out.println("Please enter your first number: ");
		firstInput = input.nextDouble();
		System.out.println("Please enter your second number: ");
		secondInput = input.nextDouble();
		
		System.out.println("Your total is: " + (secondInput * firstInput));
		
		input.close();
		
		

	}

}
