package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1;
		r1 = new Rectangulo();
		Rectangulo r2;
		r2 = new Rectangulo();
		
		int areaR1;
		int areaR2;
		double perimetro1;
		double perimetro2;
		
		r1.setBase(4);
		r1.setAltura(2);
		
		r2.setBase(8);
		r2.setAltura(3);
		
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();	
		perimetro1 = r1.calcularPerimetro();
		perimetro2 = r2.calcularPerimetro();
		
		System.out.println("area de r1: "+ areaR1);
		System.out.println("area de r2: "+ areaR2);
		System.out.println("el preimetro de r1: "+ perimetro1);
		System.out.println("el preimetro de r2: "+ perimetro2);
		
	}

}
