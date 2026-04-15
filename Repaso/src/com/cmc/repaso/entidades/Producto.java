package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		if(precio >= 0) {
			this.precio = precio;
		}else if(precio < 0 ) {
			this.precio = precio * -1;
		}
	}
	//constructor
	public Producto(String nombre,double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//metodo
	public double calcularPrecioPromo (double porcentage) {
		double descuento = precio * porcentage / 100;
		return precio - descuento;
	}
	
	

}
