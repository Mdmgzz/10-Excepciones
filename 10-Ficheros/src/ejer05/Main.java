package ejer05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// creamos scanner y variables
		Scanner sc = new Scanner(System.in);
		String nombre = ""; // te va a guardar el nombre de la persona
		int edad = 0; // guarda la edad
		String op = ""; // opcion que vas a seleccionar en el switch

		BufferedWriter bw = null;
		try {
			// Ponemos el bufferedWriter con true al final para que respete las lineas y
			// siga escribiendo al final.
			bw = new BufferedWriter(new FileWriter("src\\ejer05\\datos.txt", true));
			System.out.println("¿Quieres introducir datos? S/N");
			op = sc.next();

			while (!op.equalsIgnoreCase("n")) {
				System.out.println("Introduce el nombre: ");
				nombre = sc.next();
				System.out.println("Introduce la edad: ");
				edad = sc.nextInt();

				// Escribirmos el nombre y la edad con un espacio
				bw.write(nombre + " " + edad);

				bw.newLine(); // nueva linea
				System.out.println("Desea introducir datos? S/N");
				op = sc.next();
			}

			System.out.println("Poh hemo terminao:)");
			bw.flush();

		} catch (IOException e) {
			System.out.println("Error al abrir el fichero");
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("Error al cerrar el bufalo");
					System.out.println(e.getMessage());
				}
			}

			// cerramos scanner
			sc.close();
		}

	}
}
