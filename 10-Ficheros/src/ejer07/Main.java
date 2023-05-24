package ejer07;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, Integer> lista = Funciones.leerFichero();
		int opc;
		String nombre;
		int num;
		Scanner sc = new Scanner(System.in);

		do {
			menu();
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1:// Dar de alta el producto
				System.out.println("Introduzca el nombre del contato:");
				nombre = sc.nextLine();

				System.out.println("Introduzca el numero del contacto:");
				num = sc.nextInt();
				sc.nextLine();

				if (!lista.containsKey(nombre)) {
					lista.put(nombre, num);
				} else {
					System.out.println("El contacto ya existe");
				}

				break;
			case 2:// buscar conatcto
				System.out.println("Nombre del contacto: ");
				nombre = sc.next();
				sc.nextLine();
				if (lista.containsKey(nombre)) {
					System.out.println("Nombre: "+nombre + " Contacto: " + lista.get(nombre));
				} else {
					System.out.println("NO EXISTE EL CONTACTO");
				}
				break;
			case 3: // Listar
				System.out.println(lista);
				break;
			case 4: // Salir y guardar
				Funciones.escribirFichero(lista);
				System.out.println("AdiossAh");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opc != 4);

		// cerramos scanner
		sc.close();

	}

	private static void menu() {
		System.out.println("Seleccione una opción");
		System.out.println("1. Nuevo Contacto");
		System.out.println("2. Buscar por nombre");
		System.out.println("3. Mostrar todos.");
		System.out.println("4. Salir Y Guardar");
	}
}
