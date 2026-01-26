package com.krakedev;

public class Mensajeria {
	private String resulatdoSaludar;
	private String resultadoSaludarAmigo;
	
	
	
	public String getResulatdoSaludar() {
		return resulatdoSaludar;
	}
	public void setResulatdoSaludar(String resulatdoSaludar) {
		this.resulatdoSaludar = resulatdoSaludar;
	}
	public String getResultadoSaludarAmigo() {
		return resultadoSaludarAmigo;
	}
	public void setResultadoSaludarAmigo(String resultadoSaludarAmigo) {
		this.resultadoSaludarAmigo = resultadoSaludarAmigo;
	}
	public void saludar() {
		this.resulatdoSaludar = "hola humano";
	}
    public void saludarAmigo(String nombre,String apellido) {
    	this.resultadoSaludarAmigo = "hola " + nombre +" " + apellido;
    }
    
    
}

