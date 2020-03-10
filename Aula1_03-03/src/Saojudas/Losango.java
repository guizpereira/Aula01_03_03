package Saojudas;

import java.text.DecimalFormat;

public class Losango extends Poligono {
	
	public Losango(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
		
	}

	public double area() {
		
		return base * altura;
		
		
	}
	

	public double perimetro() {
		
		return 4*base;
		
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.##");		
		return "Calculo do Losango"
			   +"\n Área: " + area()
			   +"\n Perímetro:" + df.format(perimetro())
			   +"\n";
}
	
	

}
