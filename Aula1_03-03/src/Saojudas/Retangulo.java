package Saojudas;

import java.text.DecimalFormat;

public class Retangulo extends Poligono implements iDiagonal {
	
	public Retangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
		
	}

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public double calcDiagonal() {
	
		return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
	}
	
	public double perimetro() {
		
		return 2*base + 2*altura;
		
	}
	
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.##");		
		return "Calculo do Retangulo"
			   +"\n Área: " + area()
			   +"\n Diagonal:" + df.format(calcDiagonal())
			   +"\n Perímetro:" + df.format(perimetro())
			   +"\n";
}
	}
