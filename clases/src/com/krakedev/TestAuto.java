package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.marca = "cherry";
		auto1.año = 2024;
		auto1.precio = 18000.00;
		
		auto2.marca = "kia";
		auto2.año = 2024;
		auto2.precio = 17000.00;
		
		System.out.println("marca: " + auto1.marca);
		System.out.println("año: " + auto1.año);
		System.out.println("precio: " + auto1.precio);
		
		System.out.println("**************************");
		
		System.out.println("marca: " + auto2.marca);
		System.out.println("año: " + auto2.año);
		System.out.println("precio: " + auto2.precio);

	}

}
