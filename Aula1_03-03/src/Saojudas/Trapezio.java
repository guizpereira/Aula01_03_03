package Saojudas;

import java.text.DecimalFormat;

public class Trapezio extends Poligono{
	
	private double basema;
	private double baseme;
	private double mn;
	private double np;
	private double pr;
	private double rm;
	
	public Trapezio(double basema, double baseme, double altura, double mn, double np, double pr, double rm) {
		
		super.altura = altura;
		this.basema = basema;
		this.baseme = baseme;
		this.mn = mn;
		this.np = np;
		this.pr =  pr;
		this.rm = rm;
		
		

		
	}
	public double area() {
		
		return ((basema + baseme)*altura)/2;
		
	}
	
	public double perimetro() {
		
		double perimetrolosango =  mn + np + pr + rm;
		return  perimetrolosango;

		
	}
	
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.##");		
		return "Calculo do Trapezio"
			   +"\n Área: " + area()
			   +"\n Perímetro:" + df.format(perimetro())
			   +"\n";
}
}
