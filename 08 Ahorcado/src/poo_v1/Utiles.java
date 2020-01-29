package poo_v1;

import java.util.Scanner;

public class Utiles {
	/**
	 * Nos entrega una palabra introducida por el usuario
	 * 
	 * @return la palabra introducida
	 */
	public static char[] pedirPalabraSecreta() {
		// PedirPalabra
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la palabra secreta");
		String palabraSecreta = leer.nextLine();
		char[] cadena = palabraSecreta.toCharArray();
		for (int i = 0; i < cadena.length; i++) {
			cadena[i] = Character.toUpperCase(cadena[i]);
		}
		return cadena;
	}

	public static char pedirLetra() {
		System.out.println("mete una letra");
		Scanner leer = new Scanner(System.in);
		char letra = leer.nextLine().charAt(0);
		letra = Character.toUpperCase(letra);
		return letra;
	}
}
