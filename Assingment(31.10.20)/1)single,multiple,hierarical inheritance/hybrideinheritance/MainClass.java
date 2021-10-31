package com.technoelevate.hybrideinheritance;

public class MainClass {

	public static void main(String[] args) {
		C c=new C();
		c.view();
		System.out.println(c.l);
		c.print();
		System.out.println((c.x));
		
		B b=new B();
		b.print();
		System.out.println((b.x));
		b.disp();
		System.out.println((b.y));

	}

}
