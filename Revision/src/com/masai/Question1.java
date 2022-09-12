package com.masai;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert x coordients number");
		double x = sc.nextDouble();
		System.out.println("Please insert y coordients number");
		double y = sc.nextDouble();
		
		boolean check = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <=10;
		
		if(check==true) {
			System.out.println("x and y coordients are in the circle");
		}else {
			System.out.println("x and y coordients are not in the circle");
		}
		
		
		
	}
}
