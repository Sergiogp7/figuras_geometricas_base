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
		double radianes = Math.toRadians(angulo);
        double cosA = Math.cos(radianes);
        double sinA = Math.sin(radianes);
        
        double centroX = esquina.getX() + lado / 2;
        double centroY = esquina.getY() + lado / 2;
        
        double x = esquina.getX() - centroX;
        double y = esquina.getY() - centroY;
        
        double nuevoX = x * cosA - y * sinA + centroX;
        double nuevoY = x * sinA + y * cosA + centroY;
        
        esquina = new Punto(nuevoX, nuevoY);
	}
	
	
	
}
