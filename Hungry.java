package com.git;

import java.util.Scanner;

public class Hungry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am hungry mate");
		System.out.println("Are u hungry");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.equalsIgnoreCase("Yes"))
			System.out.println("Eat Samosa");
		else
			System.out.println("Do your homework");


	}

}
