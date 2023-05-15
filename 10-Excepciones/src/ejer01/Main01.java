package ejer01;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		//creamos scanner
		Scanner sc= new Scanner (System.in);
		// creamos una variable de tipo double para llamar a la funcion double/INT
		double valor=0;
		int valo=0;
		//preguntamos por el caracter
		System.out.println("Introduce unos caracteres: ");
		// llamamos a la funcion de readDouble en la variable creada antes
		valo= Funciones.readInt(sc);
		valor=Funciones.readDouble(sc);
		
		// si es de tipo double lo introducido devuelve lo introducido, sino devuelve el error y 0.0
		System.out.println(valor);
		// si es de tipo int lo introducido devuelve lo introducido, sino devuelve el error y 0
		System.out.println(valo);
		

	}

}
