package com.training.basicAssignments;

public class Vehical {
	String name,model;
	int price;
	
	public Vehical(String name, String model, int price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	void getDetails() {
		System.out.println("Vehical Details");
		System.out.println("name : "+name);
		System.out.println("model: "+model);
		System.out.println("price :"+price);
		System.out.println();
	}

}
