package com.krakedev;

public class Personas {
	private String nombre;
	private int edad;
	private double estatura;
	
	public Personas() {
		System.out.println("ingresa el constructor");
	}
	public Personas(String nombre) {
		this.nombre = nombre;
	}
	public Personas(String nombre,int edad,double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	

}
