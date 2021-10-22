package com.training.javaOverloading;

import java.util.Scanner;

public class overloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Employee");
		String name = sc.next();

		System.out.println("Enter the Designation of the Employee(Programmer/Manager/Director)");
		String designation = sc.next();

		double basicAllowance = 30000.0;
		double houseAllowance = 12000.0;
		double carAllowance = 10000.0;

		Employee Manager = new Employee(name, designation);
		Employee Programmer = new Employee(name, designation);
		Employee Director = new Employee(name, designation);

		if (designation.equals("Programmer")) {
			double Bsalary = Programmer.calBonus(basicAllowance);
			System.out.println("Bonus :" + Bsalary);
		} else if (designation.equals("Manager")) {
			double Bsalary = Manager.calBonus(basicAllowance, carAllowance);
			System.out.println("Bonus :" + Bsalary);
		} else if (designation.equals("Director")) {
			double Bsalary = Director.calBonus(basicAllowance, carAllowance, houseAllowance);
			System.out.println("Bonus :" + Bsalary);
		} else {
			System.out.println("Designations is  to be Manager or Director or Programmer");
		}

		sc.close();

	}

}
