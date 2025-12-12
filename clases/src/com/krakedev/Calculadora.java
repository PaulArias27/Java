package com.krakedev;

public class Calculadora {
	public int sumar(int valor1,int valor2) {
		int resultado;
		resultado = valor1 + valor2;
		return resultado;
	}
    public int restar(int valor1,int valor2) {
    	int resultado;
    	resultado = valor1 - valor2;
    	return resultado;
    	
    }
    public double multiplicar(double valor1,double valor2) {
    	double resultado;
    	resultado = valor1 * valor2;
    	return resultado;
    }
    public double dividir(double dividendo,double divisor) {
    	double resultado;
    	resultado = dividendo / divisor;
    	return resultado;
    }
    public double promedio(double valor1,double valor2,double valor3) {
    	double resultado1;
    	double resultado2;
    	resultado1 = valor1 + valor2 + valor3;
    	resultado2 = resultado1 / 3;
    	return resultado2;
    }
    public void mostrarResultado() {
    	System.out.println("Ahora no joven, sali al almuerzo. Regreso en 15 minutos ");
    }
}
