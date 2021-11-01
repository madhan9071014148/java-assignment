package com.technoelevate.assignment.javabeanclass;

public class MainTechnoelevate {

	public static void main(String[] args) {
		Technoelevate technoelevate=new Technoelevate("madhan",6,"5:30pm", "typecasting");
		Technoelevate technoelevate1=new Technoelevate("Pradeep",7,"3:30pm", "abstraction");
		
		System.out.println("Name=" +technoelevate.getName());
		System.out.println("id=" +technoelevate.getId());
		System.out.println("time=" +technoelevate.getTime());
		System.out.println("topics learnt=" +technoelevate.getTopicslearnt());
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Name=" +technoelevate1.getName());
		System.out.println("id=" +technoelevate1.getId());
		System.out.println("time=" +technoelevate1.getTime());
		System.out.println("topics learnt=" +technoelevate1.getTopicslearnt());
		

	}

}
