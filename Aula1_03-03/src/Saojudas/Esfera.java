package Saojudas;

import java.text.DecimalFormat;

public class Esfera extends Circulo implements iVolume {
	

	
	public Esfera(double raio) {
		
		super(raio);
		
	}
	
	
	

	@Override
	public double volume() {
		return ((4/3) * 3.14 * Math.pow(raio, 3));
		
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("##.##");		
		return "Calculo da Esfera"
			   +"\n Volume: " + volume()+" m³"
			   +"\n";
		
	}


}
