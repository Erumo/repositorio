package main;

public class array {
	
	private static final int MAX = 10;
	private static int array[] = new int[MAX];
	
	public static void rellenararray () {
		for (int i=0; i < array.length; i++) {
			array[i] = getNumeroAlAzar(1, 20);
		}
	}
	
	public static void imprimirarray () {
		for (int i=0; i < array.length; i++) {
			System.out.println(array[i]); 
		}
	}
	
	public static void nuevometodo1 () {
		for (int i=1; i < array.length; i++) {
			System.out.println(array[i]*2);
		}

	public static void sumararray () {
		int suma = 0;
		for (int i=0; i < array.length; i++) {
			 suma = suma + array[i];
		}
		System.out.println(suma);
	}
	
	public static void nuevometodo2 () {
		int multiplicacion = array[0];
		for (int i=1; i < array.length; i++) {
			multiplicacion = multiplicacion * array[i];
			System.out.println(array[i]);
		}
		System.out.println(multiplicacion/333333);
	}
	
	public static int getNumeroAlAzar (int CotaInf,int CotaSup) {
		return (int) Math.round(Math.random()*(CotaSup-CotaInf)+CotaInf);
	}
}



