package aula4.adsm.ex62;

import java.util.Arrays;

public class InsertionSort implements Ordenacao{

	@Override
	public void ordenar(int[] v) {
		int i, j, x;
		for (j = 1; j < v.length; ++j) {
			x = v[j];
			for (i = j - 1; i >= 0 && v[i] > x; --i) {
				v[i + 1] = v[i];
			}
			v[i + 1] = x;
		}
		System.out.println("InsertionSort: " +Arrays.toString(v));
	}

}
