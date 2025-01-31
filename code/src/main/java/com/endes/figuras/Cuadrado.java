package com.endes.figuras;

public class Cuadrado extends FiguraGeometrica{
	double lado;
	Punto esquina;
	public Cuadrado(String nombre, String color, Punto esquina, double lado) {
		super(nombre, color);
		this.esquina = esquina;
		this.lado = lado;
	}

	@Override
	public double area() {
		double area = lado * lado;
		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	public void rotar(double angulo) {
		
	}
	
	
	
}
