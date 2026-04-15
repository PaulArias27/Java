package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class testEstudiante {

	public static void main(String[] args) {
		Estudiante e = new Estudiante("Paul");
		e.calificar(4);
		
		
		System.out.println("******************");
		System.out.println("NOMBRE: "+ e.getNombre());
		System.out.println("NOTA: "+ e.getNota());
		System.out.println("RESULTADO: "+ e.getResultado());

	}

}
