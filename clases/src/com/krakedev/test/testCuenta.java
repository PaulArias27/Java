package com.krakedev.test;

import com.krakedev.cuenta;

public class testCuenta {

	public static void main(String[] args) {
		cuenta c1;
		c1 = new cuenta("03476");
		c1.setSaldo(675);
		cuenta c2 = new cuenta("03476","C",98);
		cuenta c3 = new cuenta("03476");
		c3.setTipo("C");
		cuenta c4 = new cuenta("0987");
		c4.setSaldo(10);
		cuenta c5 = new cuenta("0557","",10);
		c5.setTipo("C");
		cuenta c6 = new cuenta("0666");
		c6.setSaldo(0);
		
		System.out.println("--------Valores Iniciales----------");
		System.out.println(" ");
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		System.out.println(" ");
		System.out.println("--------Valores modificados----------");
		System.out.println(" ");
		
		c1.setSaldo(444);
		c3.setSaldo(567);
		c2.setTipo("D");
		
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		
		System.out.println(" ");
		System.out.println("--------Valores agregados----------");
		System.out.println(" ");
		
		c4.imprimirConEstilo();
		c5.imprimirConEstilo();
		c6.imprimirConEstilo();

	}

}

