package ejer02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int suma = 0;
		double media = 0;
		int contador = 0;
		String fichero="src\\ejer02\\enteros.txt";
		try {
			// el filereader funciona con un scanner en el fichero de enteros
			// al poner sc.nextInt() cogemos el siguiente numero que encuentre
			Scanner sc = new Scanner(new FileReader(fichero));

			
			while (sc.hasNextDouble()) {
				suma += sc.nextInt();
				contador++;
			}
			media = suma / contador;
			System.out.println("suma: " + suma);
			System.out.println("media: " + media);

			//cerramos el scanner aqui porque esta creado en el try
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado el fichero enteros.txt");
		}
	

	}

}
