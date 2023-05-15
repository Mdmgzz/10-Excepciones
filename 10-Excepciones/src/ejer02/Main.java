package ejer02;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//bloque de variables 
				// Creamos el objeto de hora
						
						// Abrimos el escaner
						Scanner sc = new Scanner(System.in);
						
						Hora h= new Hora();
						try {
							h.setHora(-1);
						}catch (NegativeHoraException e) {
							System.out.println(e.toString());
						}
						
						try {
							h.setMinuto(-7);
						}catch (NegativeMinuteException e) {
							System.out.println(e.toString());
						}
						
				// Cerramos el escaner
				sc.close();
				}

}
