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
	}
	
	public static int getNumeroAlAzar (int CotaInf,int CotaSup) {
		return (int) Math.round(Math.random()*(CotaSup-CotaInf)+CotaInf);
	}
}



