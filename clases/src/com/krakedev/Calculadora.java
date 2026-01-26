package com.krakedev;

public class Calculadora {
	private int resultadoSuma;
	private int resultadoResta;
	private double resultadoMulti;
	private double resultadoDivi;
	private double resultadoPromedio;
	
	
	
	
	public int getResultadoSuma() {
		return resultadoSuma;
	}
	public void setResultadoSuma(int resultadoSuma) {
		this.resultadoSuma = resultadoSuma;
	}
	public int getResultadoResta() {
		return resultadoResta;
	}
	public void setResultadoResta(int resultadoResta) {
		this.resultadoResta = resultadoResta;
	}
	public double getResultadoMulti() {
		return resultadoMulti;
	}
	public void setResultadoMulti(double resultadoMulti) {
		this.resultadoMulti = resultadoMulti;
	}
	public double getResultadoDivi() {
		return resultadoDivi;
	}
	public void setResultadoDivi(double resultadoDivi) {
		this.resultadoDivi = resultadoDivi;
	}
	public double getResultadoPromedio() {
		return resultadoPromedio;
	}
	public void setResultadoPromedio(double resultadoPromedio) {
		this.resultadoPromedio = resultadoPromedio;
	}
	
	
	public void sumar(int valor1,int valor2) {
		this.resultadoSuma = valor1 + valor2;
	}
    public void restar(int valor1,int valor2) {
    	this.resultadoResta = valor1 - valor2;    	
    }
    public void multiplicar(double valor1,double valor2) {
    	this.resultadoMulti = valor1 * valor2;
    }
    public void dividir(double dividendo,double divisor) {
    	this.resultadoDivi = dividendo / divisor;
    }
    public void promedio(double valor1,double valor2,double valor3) {
    	
    	this.resultadoPromedio = (valor1 + valor2 + valor3) / 3;
    	
    
    }
    public void mostrarResultado() {
    	System.out.println("Ahora no joven, sali al almuerzo. Regreso en 15 minutos ");
    }
}
