package aula4.adsm.ex72;

import java.util.Arrays;

public class Teste {

	public static void main(String[] args) throws Exception {
		Double[] v = construirVetor();
		Arrays.sort(v, new ComparadorDouble());
		System.out.println(Arrays.toString(v));
	}
	
	private static Double[] construirVetor() {
		int NUM = 8;
		Double[] vetor = new Double[NUM];
		for (int i = 0; i < vetor.length; i++)
			vetor[i] = Math.random() * NUM;
		return vetor;
	}
}
