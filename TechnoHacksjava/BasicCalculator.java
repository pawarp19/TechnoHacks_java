// Java program for simple calculator
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;


public class BasicCalculator 
{
		public static void main(String[] args)
	{
		// Stores two numbers
		double num1, num2;

		// Take input from the user
		Scanner sc = new Scanner(System.in);
		
        for(int i=0;i<4;i++)
		{

        // Take input for first number
		System.out.println("\nEnter first number:");
		num1 = sc.nextDouble();
		
		// Take input for second number
		
		System.out.println("\nEnter Second number:");
		num2 = sc.nextDouble();

		System.out.println("\nEnter the operator (+,-,*,/):");

		char op = sc.next().charAt(0);
		double o = 0;

		switch (op) {
		// case to add two numbers
		case '+':
			o = num1 + num2;
			break;

		// case to subtract two numbers
		case '-':
			o = num1 - num2;
			break;

		// case to multiply two numbers
		case '*':
			o = num1 * num2;
			break;

		// case to divide two numbers
		case '/':
			o = num1 / num2;
			break;

		default:
			System.out.println("\nYou enter wrong input");
		}
		
         // print the final result
		System.out.println("\nThe final result:"+"     "+num1 + " " + op + " " + num2
						+ " = " + o);
						
		System.out.println();
		}
						
	}
}
