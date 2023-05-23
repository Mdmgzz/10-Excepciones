package ejer01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Funciones {

	/**
	 * funcion para cazar el error si lo introducido no es de tipo double
	 * 
	 * @param sc Entra como parametro lo leido por teclado
	 * @return devuelve lo introdido si es de tipo Double o 0.0 si no lo es
	 */
	static double readDouble(Scanner sc) {
		double res = 0.0;
		try {
			// guardamos lo introducido por teclado en res
			res = sc.nextDouble();
			sc.nextLine();

		} catch (InputMismatchException e) {
			System.out.println("El valor introducido no es de tipo DOUBLE");// si no es de tipo double salta el error
		}

		return res;// devuelve res
	}

	/**
	 * funcion para cazar el error si lo introducido no es de tipo int
	 * 
	 * @param sc Entra como parametro lo leido por teclado
	 * @return devuelve lo introdido si es de tipo int o 0 si no lo es
	 */
	static int readInt(Scanner sc) {
		int res = 0;
		try {
			// guardamos lo introducido por teclado en res
			res = sc.nextInt();
			sc.nextLine();

		} catch (InputMismatchException e) {
			System.out.println("El valor introducido no es de tipo INT"); // si no es de tipo int salta el error
			System.out.println(e.getMessage());
		}

		return res; // devuelve res
	}
}
