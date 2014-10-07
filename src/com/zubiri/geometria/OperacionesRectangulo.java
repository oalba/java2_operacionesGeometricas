package com.zubiri.geometria;
/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class OperacionesRectangulo{

	//static final double pi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
	//private double radio;
	private double altura;
	private double base;

	//public double circunferencia(double radio) {
	//public double circunferencia() {
	public double perimetro() {

		double result;
		result = (2 * this.getAltura()) + (2* this.getBase());
		return result;

	}

	//public double area(double radio) {
	public double area() {

		double result;
		result = this.getAltura() * this.getBase();
		return result;

	}

	public double getAltura() {

		return altura;

	}

	public void setAltura(double alt) {

		altura = alt;

	}

	public double getBase() {

		return base;

	}

	public void setBase(double bas) {

		base = bas;

	}

}
