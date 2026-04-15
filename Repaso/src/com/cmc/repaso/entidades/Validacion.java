package com.cmc.repaso.entidades;

public class Validacion {
	public boolean validarMonto(int monto) {
		if(monto > 0) {
			System.out.println("verdadero");
			return true;
		}else {
			System.out.println("falso");
			return false;
		}
		
	}
	public void validarMonto() {
		System.out.println("inicio del constructor");
		
	}

}
