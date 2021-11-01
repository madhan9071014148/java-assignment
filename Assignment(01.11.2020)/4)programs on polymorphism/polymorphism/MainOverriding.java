package com.technoelevate.assignment.polymorphism;

public class MainOverriding {

	public static void main(String[] args) {
		ChildOverriding childOverriding=new ChildOverriding();
		childOverriding.trip();
		
		 ParentOverriding childOverriding1=new ParentOverriding();
		 childOverriding1.trip();
		 
		 ParentOverriding parentOverriding1=new ChildOverriding();
		 parentOverriding1.trip();
		 
		 ChildOverriding childOverriding2= (ChildOverriding) new ParentOverriding();
		 childOverriding2.trip();

	}

}