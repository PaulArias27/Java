package com.krakedev;

public class cuenta {
	private String id;
	private String tipo = "A";
	private double saldo;
	
	public cuenta(String id) {
		this.id = id;
	}
	
	public cuenta(String id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}
	public cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo =tipo;
		this.saldo = saldo;
	}
	
	
	public void imprimir() {
		System.out.println("****************************");
		System.out.println("CUENTA");
		System.out.println("****************************");
		System.out.println("Numero de cuenta: " + this.getId());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo:USD "+ this.getSaldo());
		System.out.println("****************************");		
	}
	public void imprimirConEstilo() {
		System.out.println("=============================");
		System.out.println("CUENTA");
		System.out.println("=============================");
		System.out.println("Numero de cuenta: " + this.getId());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo:USD "+ this.getSaldo());
		System.out.println("=============================");
	}
	
	
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	

}
