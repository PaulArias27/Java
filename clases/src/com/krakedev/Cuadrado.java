package com.krakedev;

public class Cuadrado {
	private int lado;
	
	
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		double area;
		area = lado * 2 + lado * 2;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro;
		perimetro = lado * 4;
		return perimetro;
	}

}
