package ejer03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String linea = "";
		String[] lista = new String[0];
		BufferedReader br =null;
		String fichero="src\\ejer03\\Alumno.txt";
		int totalEdad = 0;
		double totalAlt = 0;
		int contador = 0;
		double mediaEdad = 0;
		double mediaAlt = 0;
		

		try {
			// Creamos un buffered reader para el archivo Alumnos.txt
			br = new BufferedReader(new FileReader(fichero));

			// La linea que iremos leyendo
			linea = br.readLine();
			System.out.println("Nombres de los alumnos:");
			// Mientras la linea no sea a null (será null cuando llegue al final escrito del
			// fichero)
			while (linea != null) {

				// Pa separar a partir de un espacio
				lista = linea.split(" ");

				// Imprimir los nombres que en el split será el primer parámetro
				System.out.println(lista[0]);
				totalEdad += Integer.parseInt(lista[1]);
				totalAlt += Double.parseDouble(lista[2]);
				contador++;
				// este comando te lee la linea para pasar a la siguiente
				linea = br.readLine();
			}

			mediaEdad = (double) totalEdad / contador;
			mediaAlt = (double) totalAlt / contador;
			System.out.println();
			System.out.println("Total edad: " + totalEdad + " años");
			System.out.println("Media total: " + mediaEdad + " años");
			System.out.println("Total alturas: " + totalAlt + " m");
			System.out.println("Media alturas: " + mediaAlt + " m");

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero " + "Alumno.txt. ");
			e.getMessage();
		} catch (IOException e) {
			System.out.println("FICHERO VACIO");
			e.getMessage();

		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("Error al cerrar el bufalo");
					System.out.println(e.getMessage());
				}

			}
		}
	}

}
