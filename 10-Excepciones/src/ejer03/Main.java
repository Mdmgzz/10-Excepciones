package ejer03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// bloque de variables
		int dia;
		int mes;
		int año;

		// creamos scanner y preguntamos por la fecha
		Scanner sc = new Scanner(System.in);
		System.out.println("DIA: ");
		dia = sc.nextInt();
		System.out.println("MES: ");
		mes = sc.nextInt();
		System.out.println("AÑO: ");
		año = sc.nextInt();

		// creamos un objeto para llamar a la clase de funciones con los parametros
		// introducidos
		Fecha objeto = new Fecha(dia, mes, año);

		// mostramos el resultado llamando a la funcion toostring
		System.out.println(objeto.toString());

		if (!objeto.fechaCorrecta()) { // comprobamos si la fecha es correcta y si es correcta muestra un resultado, si
										// no lo es mostrara algo distinto
			System.out.println("La fecha introducida es incorrecta.");
		} else {
			System.out.println("La fecha introducida es correcta.");
			objeto.diaSiguiente(); // si la fecha es correcta llamaremos a la funcion dia Siguiente y mostramos el
									// dia siguiente
			System.out.println("EL DIA SIGUIENTE SERÁ: " + objeto.toString()); // una vez aumentada la fecha en un dia
																				// volvemos a mostrar como quedaria

			if (objeto.esBisiesto()) {
				System.out.println("El año introducido es bisiesto.");
			} else {
				System.out.println("El año introducido no es bisiesto");
			}
		}

		// cerramos scanner
		sc.close();
	}

}
