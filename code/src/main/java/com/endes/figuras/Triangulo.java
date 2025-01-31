package com.endes.figuras;

public class Triangulo extends FiguraGeometrica {
	
	Punto v1;
	Punto v2;
	Punto v3;
	Punto v4;

	
	public Triangulo(String nombre, String color, Punto v1,Punto v2, Punto v3,Punto v4) {
		super(nombre, color);
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
		this.v4=v4;
		
		
		
	}

	@Override
	public double area() {
		double base= v1.distancia(v2);
		double v4= base/2;
		double altura=v3.distancia(v4); 
		return 0;
	}

	@Override
	public double perimetro() {
		
		double perimetro=v1.distancia(v2)+v2.distancia(v3)+v3.distancia(v1);
		
		return perimetro;
	}
	
	public void rotar(double angulo) {
		
	}
	
	public void trasladar(double dx, double dy) {
		
	}
}
