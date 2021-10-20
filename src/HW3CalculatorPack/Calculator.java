package HW3CalculatorPack;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First number: ");
		double userNum1 = scan.nextDouble();

		System.out.println("Enter Second number: ");
		double userNum2 = scan.nextDouble();

		System.out.println("Please select between 1-5. 1:Add, 2:Subtract, 3:Multiply, 4:Divide, 5:Exit ");
		char operatorInput = scan.next().charAt(0);

		switch (operatorInput) {
		case '1':
			double result = add(user_num1, user_num2);
			System.out.println(userNum1 + " + " + userNum2 + " = " + result);
			break;
		case '2':
			double result = subtract(user_num1, user_num2);
			System.out.println(userNum1 + " - " + userNum2 + " = " + result);
			break;
		case '3':
			double result = multiply(user_num1, user_num2);
			System.out.println(userNum1 + " * " + userNum2 + " = " + result);
			break;
		case '4':
			double result = divide(user_num1, user_num2);
			System.out.println(userNum1 + " / " + userNum2 + " = " + result);
			break;
		case '5':
			System.out.println(" You have now exited ");
			break;

		default:
			System.out.println("Invalid Entry");
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
