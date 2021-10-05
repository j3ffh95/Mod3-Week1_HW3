package HW3CalculatorPack;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		char operator_selection;
		Double user_num1, user_num2, result;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number: ");
		user_num1 = scan.nextDouble();

		System.out.println("Enter second number: ");
		user_num2 = scan.nextDouble();

		System.out.println("Select between 1-5. 1:Add, 2:Subtract, 3:Multiply, 4:Divide, 5:Exit : ");
		operator_selection = scan.next().charAt(0);

		switch (operator_selection) {
		case '1':
			result = add(user_num1, user_num2);
			System.out.println(user_num1 + " + " + user_num2 + " = " + result);
			break;
		case '2':
			result = subtract(user_num1, user_num2);
			System.out.println(user_num1 + " - " + user_num2 + " = " + result);
			break;
		case '3':
			result = multiply(user_num1, user_num2);
			System.out.println(user_num1 + " * " + user_num2 + " = " + result);
			break;
		case '4':
			result = divide(user_num1, user_num2);
			System.out.println(user_num1 + " / " + user_num2 + " = " + result);
			break;
		case '5':
			System.out.println(" You have now exited ");
			break;

		default:
			System.out.println("Invalid Entry, Try Again!");
			break;

		}

		scan.close();

	}

//	MATH Methods for calculating solutions

	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public static double divide(double num1, double num2) {
		return num1 / num2;
	}

}