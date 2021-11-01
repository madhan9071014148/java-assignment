package com.technoelevate.student.abstraction;

import java.util.Scanner;

import com.technoelevate.assignment.abstraction.Bike;
import com.technoelevate.assignment.abstraction.Car;
import com.technoelevate.assignment.abstraction.Truck;
import com.technoelevate.assignment.abstraction.VehicleFactory;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentFactory factory = new StudentFactory();
		System.out.println("Welcome to Student characteristics ");
		System.out.println("----------------------------------------");
		while (true) {
			System.out.println("1.Nitish\n2.Siddhu\n3.Saqlin\n4.Exit");
			System.out.println("please select your fav Student");
			System.out.println("*********************************************");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				factory.display(new Nitish());
				break;
			case 2:
				factory.display(new Siddhu());
				break;
			case 3:
				factory.display(new Saqlin());
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("invalid choice");
			}
		}
	}

}
