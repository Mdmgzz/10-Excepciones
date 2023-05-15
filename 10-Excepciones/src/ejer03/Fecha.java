package ejer03;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	public Fecha() {

	}

	/**
	 * da a las variables privadas el valor de las que entran por parametros
	 * 
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	/**
	 * da a la fecha dia el valor de año si es correcto
	 * 
	 * @param dia
	 */
	public void setDia(int dia) {
		if (dia >= 1 && dia <= 31) {
			this.dia = dia;
		}
	}

	/**
	 * obtiene la fecha mes
	 * 
	 * @return
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * da a la fecha mes el valor de año si es correcto
	 * 
	 * @param mes
	 */
	public void setMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		}
	}

	/**
	 * saca el valor de año
	 * 
	 * @return
	 */
	public int getAño() {
		return año;
	}

	/**
	 * da a la fecha año el valor de año si es correcto
	 * 
	 * @param año
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * te comprueba si el año es bisiesto
	 * 
	 * @return
	 */
	public boolean esBisiesto() {
		boolean bisiesto = false;
		if (año % 4 == 0 || (año % 100 != 0 && año % 400 == 0)) { // Si además es divisible entre 100
			bisiesto = true; // Si es divisible entre 100 y 400 es bisiesto
		}

		return bisiesto;
	}

	/**
	 * comprueba que los numeros introducidos estan dentro de sus limites
	 * 
	 * @return devuelve si es correcya o no
	 */
	public boolean fechaCorrecta() {
		boolean correcta = false;
		switch (mes) {
		case 2:
			if ((esBisiesto() && dia < 30) || (!esBisiesto()) && dia < 29) {
				correcta = true;
			}
			break;
		case 4, 6, 9, 11:
			if (dia < 31) {
				correcta = true;
			}
			break;
		case 1, 3, 5, 7, 8, 10, 12:
			correcta = true;
			break;
		}

		return correcta;
	}

	/**
	 * esta funcion añadira un dia a la fecha introducida si es el ultimo dia del
	 * mes, este aumentara en 1 su valor al añadirle un dia no recibe ninguun
	 * parametro y tampoco devuelve nada
	 */
	public void diaSiguiente() {
		dia++;
		switch (mes) {
		case 2:
			if ((esBisiesto() && dia > 29) || (!esBisiesto()) && dia > 28) {
				dia = 1;
				mes++;
			}
			break;
		case 4, 6, 9, 11:
			if (dia > 30) {
				dia = 1;
				mes++;
			}
			break;
		case 1, 3, 5, 7, 8, 10:
			if (dia > 31) {
				dia = 1;
				mes++;
			}
			break;
		case 12:
			if (dia > 31) {
				dia = 1;
				mes = 1;
				año++;
			}
		}

	}

	/**
	 * crea una cadena para mostrar la fecha en el formato correcto
	 * 
	 * @param dia
	 * @param mes
	 * @param año
	 * @return devuelve la fecha en el buen formato
	 */
	public String toString() {
		String cadena = "";

		if (dia > 0 && dia <= 9) {
			cadena = "0" + dia + "/" + mes + "/" + año;
		} else if (mes > 0 && mes <= 9) {
			cadena = dia + "0" + "/" + mes + "/" + año;
		}

		return cadena;
	}
}
