package Saojudas;

import java.util.ArrayList;


public class Geometria {
	public static void main(String[] args) {
	
	ArrayList<Figura> figuras = new ArrayList<Figura>();
	
	Figura triangulo = new Triangulo(4, 6, 3, 3, 3);
	figuras.add(triangulo);
	Figura retangulo = new Retangulo(8, 7);
	figuras.add(retangulo);
	Figura esfera = new Esfera(3);
	figuras.add(esfera);
	Figura losango = new Losango(2,3);
	figuras.add(losango);
	Figura trapezio = new Trapezio(5, 4, 4, 3, 3, 3, 3);
	figuras.add(trapezio);
	Figura cubo = new Cubo(3);
	figuras.add(cubo);
	Figura piramide = new Piramide(3,5);
	figuras.add(piramide);
	Figura quadrado = new Quadrado(4);
	figuras.add(quadrado);
	Figura cilindro = new Cilindro(3,5);
	figuras.add(cilindro);
	
	for(Figura fig: figuras) {
		
		System.out.println(fig);
		
	}

}
}
