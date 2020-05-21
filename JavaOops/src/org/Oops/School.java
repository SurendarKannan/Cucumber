package org.Oops;

import java.io.ObjectInputStream.GetField;

public class School {
	
	private String email;
	private double rollno;
	
	/*String show(String email) {
	
		this.email = email;
		return email;
	}
	
	double done(double rollno) {
		this.rollno = rollno;
		return rollno;
	}*/
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getRollno() {
		return rollno;
	}

	public void setRollno(double rollno) {
		this.rollno = rollno;
	}


public static void main(String[] args) {

	School s  = new School();
	s.setEmail("suren@gmail.com");
	System.out.println(s.getEmail());
	s.setRollno(54545);
	System.out.println(s.getRollno());
}
}
