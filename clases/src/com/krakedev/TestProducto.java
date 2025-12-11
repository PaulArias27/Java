package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre = "gasas";
		productoA.descripcion = "para cubrir heridas";
		productoA.precio = 2.40;
		productoA.stockActual = 40;
		
		productoB.nombre = "Ibuprofeno";
		productoB.descripcion = "para cubrir controlar la fiebre";
		productoB.precio = 0.50;
		productoB.stockActual = 70;
		
		productoC.nombre = "Paracetamol";
		productoC.descripcion = "para controlar los dolores";
		productoC.precio = 0.70;
		productoC.stockActual = 90;
		
		System.out.println("nombre: "+ productoA.nombre);
		System.out.println("descripcion: "+ productoA.descripcion);
		System.out.println("precio: "+ productoA.precio);
		System.out.println("stock: "+ productoA.stockActual);

		System.out.println("*********************************");
		
		System.out.println("nombre: "+ productoB.nombre);
		System.out.println("descripcion: "+ productoB.descripcion);
		System.out.println("precio: "+ productoB.precio);
		System.out.println("stock: "+ productoB.stockActual);
		
		System.out.println("*********************************");
		
		System.out.println("nombre: "+ productoC.nombre);
		System.out.println("descripcion: "+ productoC.descripcion);
		System.out.println("precio: "+ productoC.precio);
		System.out.println("stock: "+ productoC.stockActual);
	}

}
