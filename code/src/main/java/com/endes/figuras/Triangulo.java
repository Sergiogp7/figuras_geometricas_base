package com.endes.figuras;

public class Triangulo extends FiguraGeometrica {
	
	private Punto v1;
	private Punto v2;
	private Punto v3;

	public Triangulo(String nombre, String color, Punto v1,Punto v2, Punto v3) {
		super(nombre, color);
		
	}

	@Override
	public double area() {
		
		return ()/2;
	}

	@Override
	public double perimetro() {
		
		return 0;
	}
	
	public void rotar(double angulo) {
		
	}
	
	public void trasladar(double dx, double dy) {
		
	}
}
