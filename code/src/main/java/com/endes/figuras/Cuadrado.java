package com.endes.figuras;

public class Cuadrado extends FiguraGeometrica{
	double lado;
	public Cuadrado(String nombre, String color, Punto esquina, double lado) {
		super(nombre, color);
		this.lado=lado;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void rotar(double angulo) {
		
	}
	
	
	
}
