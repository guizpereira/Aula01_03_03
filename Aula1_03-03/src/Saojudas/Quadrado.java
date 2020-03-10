package Saojudas;

import java.text.DecimalFormat;

public class Quadrado extends Poligono implements iDiagonal{
	

	public Quadrado(double base) {
		
		this.base = base;
		
			
	}
	
	public double area() {
	
		return base * base;
		
	}
	
	public double calcDiagonal() {
	
			return base * Math.sqrt(2);
	}
	
	public double perimetro() {
		
		return base*4;
		
	}
	
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.##");		
		return "Calculo do Quadrado"
			   +"\n Área: " + area()
			   +"\n Diagonal:" + df.format(calcDiagonal())
			   +"\n Perímetro:" + df.format(perimetro())
			   +"\n";
		
		
		
	}
	
}
