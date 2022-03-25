package com.even;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		if(n%2!=0)
		{
			System.out.println("Weird");
		}

		else if (n >= 2 && n <= 6)
		{
			System.out.println("Not Weird");
		} 
		else if (n >= 6 && n <= 20)
		{
			System.out.println("Weird");
		} 
		else if (n>20)
		{
			System.out.println("Not Weird");

		}

		else
		{
			System.out.println("anything");
		}
		scanner.close();



	}

}
