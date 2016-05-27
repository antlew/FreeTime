package com.freelance.ageproject;

import java.util.Scanner;

public class AgeProject {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Hey what is your name? ");
		name = reader.next();
		
		System.out.println("Hello " + name + " how old are you? ");
		age = reader.nextInt();
		
		if(age < 16){
			System.out.println("Sorry " + name + " you can't drive.");
		}
		if(age < 18){
			System.out.println("Sorry " + name + " you can't vote.");
		}
		if(age < 25){
			System.out.println("Sorry " + name + " you can't rent a car.");
		}
		else{
			System.out.println(name + " you can do anything that's legal.");
		}
		
		reader.close();

	}

}
