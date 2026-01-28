package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personas p;
		p = new Personas();
		Personas p2 = new Personas();
		Personas p3 = new Personas("Pablo");
		Personas p4 = new Personas("Rocio",43,1.60);
		
		System.out.println("nombre: " + p4.getNombre());
        System.out.println("edad: " + p4.getEdad());
        System.out.println("estatura: " + p4.getEstatura());
		
        System.out.println("nombre: " + p.getNombre());
        System.out.println("edad: " + p.getEdad());
        System.out.println("estatura: " + p.getEstatura());
        
        //modificar los atributos
        p.setNombre("Paul");
        p.setEdad(26);
        p.setEstatura(1.70);
        
        System.out.println("---------------------------");
        
        System.out.println("nombre: " + p.getNombre());
        System.out.println("edad: " + p.getEdad());
        System.out.println("estatura: " + p.getEstatura());
        
        p2.setNombre("Valeria");
        
        System.out.println("***************");
        System.out.println("p.nombre: " + p.getNombre());
        System.out.println("p2.nombre: "+ p2.getNombre());
	}

}
