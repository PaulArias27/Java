package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personas p;
		p = new Personas();
		Personas p2 = new Personas();
		
        System.out.println("nombre: " + p.nombre);
        System.out.println("edad: " + p.edad);
        System.out.println("estatura: " + p.estatura);
        
        //modificar los atributos
        p.nombre = "Paul";
        p.edad = 26;
        p.estatura = 1.70;
        
        System.out.println("---------------------------");
        
        System.out.println("nombre: " + p.nombre);
        System.out.println("edad: " + p.edad);
        System.out.println("estatura: " + p.estatura);
        
        p2.nombre = "Valeria";
        
        System.out.println("***************");
        System.out.println("p.nombre: " + p.nombre);
        System.out.println("p2.nombre: "+ p2.nombre);
	}

}
