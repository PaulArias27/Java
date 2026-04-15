package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class testItem {

	public static void main(String[] args) {
		Item i = new Item("laptop");
		i.setProductosActuales(20);
		i.imprimir();
		
		i.vender(5);
		i.imprimir();
		
		i.debolver(2);
		i.imprimir();
		
		Item i2 = new Item("cpu");
		i2.setProductosActuales(30);
		i2.imprimir();
		
		i2.vender(15);
		i2.imprimir();
		
		i2.debolver(5);
		i2.imprimir();

	}

}
