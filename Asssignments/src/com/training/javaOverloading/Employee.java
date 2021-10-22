package com.training.javaOverloading;

public class Employee {
	String name, designation;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}

	 double calBonus(double basicAllowance) {
		double bonus = basicAllowance * (2);
		return bonus;

	}

	 double calBonus(double basicAllowance, double carAllowance) {
		double bonus = basicAllowance * (2) + carAllowance * (2);
		return bonus;

	}

	 double calBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		double bonus = basicAllowance * (2) + carAllowance * (2) + houseAllowance * (2);
		return bonus;

	}
}
