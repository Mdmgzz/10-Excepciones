package ejer08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Temperaturas {

		private static final String FICHERO = "src\\ejer8\\registro.txt";

		public static void main(String[] args) {
			
			String linea;
			String fecha;
			String[] datos;
			Scanner sc = new Scanner(System.in);
			BufferedWriter bw = null;
			BufferedReader br = null;
			int op;		
			double tempMin;
			double tempMax;
			double tempMinTotal = Double.MAX_VALUE;
			double tempMaxTotal = Double.MIN_VALUE;
			
			try {
				//declaras el buffer con la ruta
				bw = new BufferedWriter(new FileWriter(FICHERO, true));
				
				do {
					menu();
					op = sc.nextInt();
					sc.nextLine();

					switch (op) {
					case 1: // Registrar temperatura
						
						System.out.println("Introduzca la fecha (aaaa-mm-dd):");
						fecha = sc.nextLine();

						System.out.println("Introduzca la temperatura mínima:");
						tempMin = sc.nextDouble();
						sc.nextLine();

						System.out.println("Introduzca la temperatura máxima:");
						tempMax = sc.nextDouble();
						sc.nextLine();

						// escribimos en el fichero con espacios para luego hacer split a partir del espacio
						bw.write(fecha + " " + tempMax + " " + tempMin);
						bw.newLine();

						bw.flush();

						break;
					case 2: // Mostrar historial
						br = new BufferedReader(new FileReader(FICHERO));
						br.readLine();
						linea = br.readLine();
						while (linea != null) {
							datos = linea.split(" ");
							System.out.println("Fecha: " + datos[0]);

							tempMax = Double.parseDouble(datos[1]);

							tempMin = Double.parseDouble(datos[2]);

							System.out.println("Temperatura máxima: " + tempMax);
							System.out.println("Temperatura mínima: " + tempMin);
							System.out.println("--------------------------------");

							if (tempMaxTotal < tempMax) {
								tempMaxTotal = tempMax;
							}

							if (tempMinTotal > tempMin) {
								tempMinTotal = tempMin;
							}

							linea = br.readLine();
						}
						System.out.println("Temperatura máxima total: " + tempMaxTotal);
						System.out.println("Temperatura mínima total: " + tempMinTotal);
						System.out.println();
						break;
					}

				} while (op != 3);
				
				
			} catch (IOException e) {
				System.out.println("Error al abrir el fichero");
				System.out.println(e.getMessage());
			} finally {
				if (bw != null) {
					try {
						bw.close();
						br.close();
						sc.close();
					} catch (IOException e) {
						System.out.println("Error al cerrar el fichero");
						System.out.println(e.getMessage());
					}
				}
			}

		}

		public static void menu() {
			System.out.println("1. Registra nueva temperatura.");
			System.out.println("2. Mostrar historial de registros.");
			System.out.println("3. Salir.");
		}


}
