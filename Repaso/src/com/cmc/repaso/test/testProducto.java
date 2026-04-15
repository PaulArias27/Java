package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class testProducto {

	public static void main(String[] args) {
		Producto p = new Producto("jabon",10);
		System.out.println("NOMBRE: "+ p.getNombre());
		System.out.println("PRECIO: "+ p.getPrecio());
		
		p.setPrecio(10);
		System.out.println("NUEVO PRECIO: "+ p.getPrecio());
		
		double promo = p.calcularPrecioPromo(10);
		System.out.println("PRECIO PROMO: " + promo);

	}

}
