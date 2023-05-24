package ejer07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Funciones {
	public static HashMap<String, Integer> leerFichero() {

		HashMap<String, Integer> contactos = new HashMap<String, Integer>();

		String nombre;
		int num;

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("src\\ejer07\\telefonos.txt"));

			String linea = br.readLine();
			String[] datos;

			while (linea != null) {
				datos = linea.split(" ");

				nombre = datos[0];
				num = Integer.parseInt(datos[1]); // Devuelve int, tipo primitivo

				contactos.put(nombre, num);

				linea = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("ERROR al abrir el fichero");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("ERROR al leer el fichero");
			System.out.println(e.getMessage());
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

		return contactos;

	}

	public static void escribirFichero(HashMap<String, Integer> lista) {
		BufferedWriter bw = null;
		String nombre;
		long num;
		try {
			bw = new BufferedWriter(new FileWriter("src\\ejer07\\telefonos.txt"));

			for (String nom : lista.keySet()) {
				nombre = nom;
				num = lista.get(nom);

				bw.write(nombre + " " + num);
				bw.newLine();
			}

			bw.flush();

		} catch (IOException e) {
			System.out.println("Error al abrir el fichero");
			System.out.println(e.getMessage());
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("Error al cerrar el bufalo");
					System.out.println(e.getMessage());
				}
			}
		}
	}

}