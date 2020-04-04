package aula4.adsm.ex62;

import java.util.Arrays;

public class SelectionSort implements Ordenacao{

	@Override
	public void ordenar(int[] vetor) {
		int i, j, min, x;
		for (i = 0; i < vetor.length - 1; ++i) {
			min = i;
			for (j = i + 1; j < vetor.length; ++j) {
				if (vetor[j] < vetor[min])
					min = j;
			}
			x = vetor[i];
			vetor[i] = vetor[min];
			vetor[min] = x;
			
		}
		 for(int y=0;y<10;y++){
			 
		    }	System.out.println("SelectSort: " +Arrays.toString(vetor));
		
	}
}
