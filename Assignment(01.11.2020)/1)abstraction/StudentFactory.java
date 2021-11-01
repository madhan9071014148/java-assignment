package com.technoelevate.student.abstraction;

public class StudentFactory {
	public void display (Student s) {
		if(s instanceof Nitish) {
			s.character();
		}
		else if(s instanceof Siddhu){
			s.character();
		}
		else if(s instanceof Saqlin){
			s.character();
		}
		else {
			//do nothing
		}
	}

}
