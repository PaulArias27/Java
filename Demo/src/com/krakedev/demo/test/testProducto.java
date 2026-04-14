package com.krakedev.demo.test;
import com.krakedev.demo.Producto;

public class testProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p = new Producto(2000,"Paul");
		
		// descripcion y peso modificados
		p.setDescripcion("Masculino");
		p.setPeso(125);
		
		System.out.println("**********************");
		System.out.println("CODIGO: "+ p.getCodigo());
		System.out.println("NOMBRE: "+ p.getNombre());
		System.out.println("DESCRIPCION: "+ p.getDescripcion());
		System.out.println("PESO: "+ p.getPeso());
	}

}
