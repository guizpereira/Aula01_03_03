package Saojudas;

import java.text.DecimalFormat;

public class Piramide extends Quadrado implements iVolume {

	private double altura;
	
	public Piramide(double base, double altura) {
		super(base);
		this.altura = altura;
	
	}

	@Override
	public double volume() {
		
		return 0.33* Math.pow(base,2) * altura;
	}
	
	
	public String toString() {
		
		return "Calculo da Piramide"
			   +"\n Volume: " + volume() +" m³"
			   +"\n";
		
	}

}
