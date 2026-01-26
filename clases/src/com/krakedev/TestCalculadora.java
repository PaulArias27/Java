package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		
		calcu = new Calculadora();
		calcu.sumar(5,3);
		calcu.restar(10, 3);
		calcu.multiplicar(10, 5);
		calcu.dividir(10, 2);
		calcu.promedio(10, 8, 9);
		
		System.out.println("RESULTADO SUMA: "+ calcu.getResultadoSuma());
		System.out.println("RESULTADO RESTA: "+ calcu.getResultadoResta());
		System.out.println("RESULTADO MULTIPLICACION: "+ calcu.getResultadoMulti());
		System.out.println("RESULTADO DIVISION: "+ calcu.getResultadoDivi());
		System.out.println("RESULTADO PROMEDIO: "+ calcu.getResultadoPromedio());
		calcu.mostrarResultado();
	}

}
