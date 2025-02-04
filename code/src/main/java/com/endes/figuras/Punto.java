package com.endes.figuras;

public class Punto{
	private double x, y;
	public Punto (double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX () {
		return x;
	}
	public double getY () {
		return y;
	}
	public void setX (double x) {
		this.x =x;
	}
	public void setY(double y) {
		this.y =y;
	}
	public double distancia(Punto otro) {
		double diferenciaX = this.x - otro.getX();
        double diferenciaY = this.y - otro.getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
	}

}
