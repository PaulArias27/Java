package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.setMarca("cherry");
		auto1.setAño(2024);
		auto1.setPrecio(18000.00);
		
		auto2.setMarca("kia");
		auto2.setAño(2024);
		auto2.setPrecio(17000.00);
		
		System.out.println("marca: " + auto1.getMarca());
		System.out.println("año: " + auto1.getAño());
		System.out.println("precio: " + auto1.getPrecio());
		
		System.out.println("**************************");
		
		System.out.println("marca: " + auto2.getMarca());
		System.out.println("año: " + auto2.getAño());
		System.out.println("precio: " + auto2.getPrecio());

	}

}
