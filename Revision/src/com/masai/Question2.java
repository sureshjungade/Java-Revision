package com.masai;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	
	public static void main(String[] args) {
		Lottery lottery = new Lottery();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert your lottery number");
		int inputNumber = sc.nextInt();
		lottery.checkwinner(inputNumber);
		
	}
}

class Lottery  {
	
	public void checkwinner(Integer number) {
		Integer lotteryNumber = 567;
		String str = lotteryNumber.toString();
		Integer arr[] = new  Integer[str.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		
		String str1 = number.toString();
		Integer arr1[] = new  Integer[str1.length()];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = str.charAt(i) - '0';
		}
		
		if(number.equals(lotteryNumber)) {
			System.out.println("$ 10,000");
			
		}
		else if(arr.length==arr1.length) {
			Arrays.sort(arr);
			Arrays.sort(arr1);
			int count = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals(arr1[i])) {
					count++;
				}
			}
			if(count==arr.length) {
				System.out.println("$ 3,000");
				System.out.println("The lottery Number is 567");
			}
		}else {
			int count = 0;
			int n = Math.min(arr.length, arr1.length);
			for(int i=0; i<n; i++) {
				if(arr[i].equals(arr1[i])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("$ 1,000");
				System.out.println("The lottery Number is 567");
			}
		}
		
	}
	
}