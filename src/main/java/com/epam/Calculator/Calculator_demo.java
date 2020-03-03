package com.epam.Calculator;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculator_demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		long num1 = sc.nextLong();
		BigInteger s = null;
		System.out.println("Enter your choice: 1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo");
		choice = sc.nextInt();
		long num2 = sc.nextLong();
		Operation op = new Operation();
		switch(choice) {
		case 1: s = op.Addition(num1,num2);
		        break;
		case 2: s = op.Subtraction(num1,num2);
		        break;
		case 3: s = op.Multplication(num1, num2);
		        break;
		case 4: s = op.Division(num1, num2);
		        break;
		case 5: s = op.Modulo(num1,num2);
		        break;
		default: System.out.println("Invalid choice");
		}
		System.out.println("Result: "+ String.valueOf(s));
		sc.close();
	}
}
