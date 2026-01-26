package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.setNombre("gasas");
		productoA.setDescripcion("para cubrir heridas");
		productoA.setPrecio(2.40);
		productoA.setStockActual(40);
		
		productoB.setNombre("Ibuprofeno");
		productoB.setDescripcion("para cubrir controlar la fiebre");
		productoB.setPrecio(0.50);
		productoB.setStockActual(70);
		
		productoC.setNombre("Paracetamol");
		productoC.setDescripcion("para controlar los dolores");
		productoC.setPrecio(0.70);
		productoC.setStockActual(90);
		
		System.out.println("nombre: "+ productoA.getNombre());
		System.out.println("descripcion: "+ productoA.getDescripcion());
		System.out.println("precio: "+ productoA.getPrecio());
		System.out.println("stock: "+ productoA.getStockActual());

		System.out.println("*********************************");
		
		System.out.println("nombre: "+ productoB.getNombre());
		System.out.println("descripcion: "+ productoB.getDescripcion());
		System.out.println("precio: "+ productoB.getPrecio());
		System.out.println("stock: "+ productoB.getStockActual());
		
		System.out.println("*********************************");
		
		System.out.println("nombre: "+ productoC.getNombre());
		System.out.println("descripcion: "+ productoC.getDescripcion());
		System.out.println("precio: "+ productoC.getPrecio());
		System.out.println("stock: "+ productoC.getStockActual());
	}

}
