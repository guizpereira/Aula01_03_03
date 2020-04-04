package aula4.adsm.ex62;

import java.util.Random;

public class TesteOrdenacao {

	public static void main(String[] args) {
		
		Random random = new Random();
		Ordenacao ordenacao = null;
		int numero = random.nextInt(4);
		 
		if(numero == 0) {
			ordenacao = new BubbleSort();
			} else if (numero == 1) {
				 ordenacao = new InsertionSort();
			} else if (numero == 2) {
				ordenacao = new SelectionSort();
			} else if (numero == 3) {
				ordenacao = new QuickSort();
		}
		
		Ordenador ordenador = new Ordenador(ordenacao);
		int vetor[] = {15,3,56,987,12,5222,154,32,51141,321,5,1,4,22} ;
		ordenador.ordenarVetor(vetor);
		
	
	}

}
