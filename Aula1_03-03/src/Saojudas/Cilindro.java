package Saojudas;

import java.text.DecimalFormat;

public class Cilindro extends Circulo implements iVolume {
	
	
	private double altura;
	
	public Cilindro(double raio, double altura) {
		
		super(raio);
		this.altura = altura;
		
		
		
		
	}

	@Override
	public double volume() {
	
		return 3.14 * Math.pow(raio, 2) * altura;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.##");		
		return "Calculo do Cilindro"
			   +"\n Volume: " + volume() +" m³"
			   +"\n";
		
	}

	
	

}
