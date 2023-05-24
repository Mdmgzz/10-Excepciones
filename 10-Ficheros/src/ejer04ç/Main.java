package ejer04ç;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String texto = "";
		BufferedWriter bw = null;
		String fichero = "src\\ejer04ç\\texto04.txt";
		Scanner sc = new Scanner(System.in);

		try {
			bw = new BufferedWriter(new FileWriter(fichero));
			System.out.println("Introduce lineas de texto: ");
			System.out.println("Para finalizar escribe fin.");

			texto = sc.nextLine();

			bw.write(texto);

			while (!texto.equalsIgnoreCase("fin")) {
				bw.newLine();
				texto = sc.next();
				bw.write(texto);
			}

			bw.flush();
			System.out.println("Texto añadio");
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero " + "texto04.txt ");
			e.getMessage();
		} catch (IOException e) {
			System.err.println("Error al escribir en el fichero");
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
