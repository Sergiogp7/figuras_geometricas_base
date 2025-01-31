package com.endes.figuras;

public class Circulo extends FiguraGeometrica{
	double radio;
	Punto centro;
	public Circulo(String nombre, String color, Punto centro, double radio) {
		super(nombre, color);
		this.radio = radio;
	}
	
	@Override
	public double area() {
		return Math.PI * radio * radio;
	}
	
	@Override
	public double perimetro() {
		return Math.PI * radio * 2;
	}
	
	@Override
	public void rotar(double angulo) {
		System.out.println("Rotando el circulo " + angulo + " grados.");
	}
	
	@Override
	public void trasladar(double dx, double dy) {
		System.out.println("Trasladando el circulo en (" + dx + ", " + dy + ").");
	}
	
 }
