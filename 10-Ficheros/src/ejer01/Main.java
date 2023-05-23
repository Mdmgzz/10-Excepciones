package ejer01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		// creamos la variable del scanner
		Scanner sc = null;
		// creamos la variable donde se va a guardar la ruta
		String rutaArchivo = "src\\ejer01\\NumerosReales.txt";

        try {
        	//declaro el scanner con el flujo 
        	sc = new Scanner(new FileReader(rutaArchivo));
        	// variable que guarda la cantidad de numeros y la suma 
            double suma = 0.0;
            int contador = 0;
            // el bucle va sumando todos los numeros y aumentando en 1 el contador 
            while (sc.hasNext()) {
                double numero = sc.nextDouble();
                suma += numero;
                contador++;
            }

            sc.close();

            // si el contador es mayor que 0 entonces hace la media de los numeros y lo muestra
            if (contador > 0) {
                double media = suma / contador;
                System.out.println("Suma: " + suma);
                System.out.println("Media: " + media);
            } else {
                System.out.println("El archivo está vacío.");
            }
            
            // si no encuentra el fichero saltará el error
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo NumerosReales.txt");
        }

	}

}
