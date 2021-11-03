package com.technoelevate.exception;

import java.util.Scanner;

public class PredefinedException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("Enter then first Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second Number");
		int num2 = sc.nextInt();
		div(num1, num2);
		}
	}

	private static void div(int num1, int num2) {
		try {
			System.out.println("Perform division");
			System.out.println(num1 / num2);
			System.out.println("Division sucessfull");

		} catch (ArithmeticException e) {
			System.err.println("Arithmetic Exception");
		} catch (IndexOutOfBoundsException e) {
			System.err.println("IndexOutOfBoundsException Exception");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Done with the execution");
		}

	}

}
