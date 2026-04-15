package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	//costructor
	public Item(String nombre) {
		this.nombre = nombre;
	}
	
	public void imprimir() {
		System.out.println("PRODUCTOS ACTUALES: " + productosActuales);
		System.out.println("PRODUCTOS DEVUELTOS: " + productosDevueltos);
		System.out.println("PRODUCTOS VENDIDOS: " + productosVendidos);
		System.out.println("***************************");
	}
	public void vender(int productosVendido) {
		int productosActual = productosActuales - productosVendido;
		this.productosActuales = productosActual;
		int vendidos = productosVendidos + productosVendido;
		this.productosVendidos = vendidos;
	}
	public void debolver(int cantiProductosVendidos) {
		int actuales = productosActuales + cantiProductosVendidos;
		this.productosActuales = actuales;
		int vendidos = productosVendidos - cantiProductosVendidos;
		this.productosVendidos = vendidos;
		int devueltos = productosDevueltos + cantiProductosVendidos;
		this.productosDevueltos = devueltos;
	}
	
	

}
