package Saojudas;

import java.text.DecimalFormat;

public class Cubo extends Quadrado implements iVolume{

		

	public Cubo(double base) {
		super(base);
	
		
	}
	
	public double volume() {
		
		return Math.pow(base, 3);
		
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.##");		
		return "Calculo do Cubo"
			   +"\n Volume: " + volume()+" m³"
			   +"\n";
		
	}
	

}
