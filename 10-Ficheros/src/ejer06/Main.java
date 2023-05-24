package ejer06;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Integer> ordenacion = new TreeSet<Integer>();
		int numero = 0;
		String numString;
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter("src\\ejer06\\ascendente.txt"));
			Scanner sc = new Scanner(new FileReader("src\\ejer06\\numeroDesordenados.txt"));

			while (sc.hasNextInt()) {
				numero = sc.nextInt();
				ordenacion.add(numero);
			}
			for (int num : ordenacion) {
				numString = Integer.toString(num);
				bw.write(numString);
				bw.newLine();
			}
			bw.flush();
			System.out.println(ordenacion);
		} catch (IOException e) {
			System.out.println("Error al encontrar el archivo");
		}finally {
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
