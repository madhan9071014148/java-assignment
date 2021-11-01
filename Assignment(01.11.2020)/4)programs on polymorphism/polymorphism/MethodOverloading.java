package com.technoelevate.assignment.polymorphism;

public class MethodOverloading {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverloading methodOverloading=new MethodOverloading();
		System.out.println(methodOverloading.add(10, 20));
		System.out.println(methodOverloading.add(10, 20.2));
	}
}
