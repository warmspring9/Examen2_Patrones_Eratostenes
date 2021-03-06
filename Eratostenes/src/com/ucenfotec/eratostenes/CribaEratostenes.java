package com.ucenfotec.eratostenes;

public class CribaEratostenes {

	public static int[] generaCriba(int tope){
		if (tope >= 2){
			int dim = tope+1;
			boolean[] primo = buscarNoPrimos(dim);
			return generarListaPrimos(dim, primo);
		} else {
			return new int[0];
		}
		
	}

	private static int[] generarListaPrimos(int dim, boolean[] primo) {
		int i;
		int j;
		int cuenta = 0;
		
		for (i = 0; i < dim; i++){
			if (primo[i])
				cuenta++;
		}
		int[] primos = new int[cuenta];
		for (i = 0,j=0; i < dim; i++){
			if (primo[i])
				primos[j++] = i;
		}
		return primos;
	}

	private static boolean[] buscarNoPrimos(int dim) {
		int i;
		int j;
		boolean[] primo = new boolean[dim];
		
		for (i = 0; i < dim; i++){
			primo[i] = true;
		}
		primo[0] = primo[1] = false;
		for (i = 2; i< Math.sqrt(dim) + 1; i++){
			if (primo[i]){
				for (j = 2*i; j < dim; j+=i){
					primo[j] = false;
				}
			}
		}
		return primo;
	}
}
