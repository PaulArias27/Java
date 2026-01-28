package com.krakedev;

public class TestMensajeria {

	public static void main(String[] args) {
		Mensajeria m;
		m = new Mensajeria("hola todos");
		m.saludarAmigo("Paul", "Arias");
		
		System.out.println(m.getResulatdoSaludar());
		System.out.println(m.getResultadoSaludarAmigo());

	}

}
