package com.krakedev.controlFlujotest;

import com.krakedev.controlFlujo.Validador;

public class testValidador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validador validador = new Validador();
		validador.validarEdad(10);
		validador.validarEdad(20);
		validador.validarEdad(18);
		validador.validarEdad(16);
		validador.validarEdad(-3);
	}

}
