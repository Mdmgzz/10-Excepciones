package ejer02;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;

	public Hora() {

	}

	/**
	 * da a los atributos privados los valores que le entran por los parametros
	 * 
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	/**
	 * pbtiene el valor de hora
	 * 
	 * @return devuelve el valor de hora
	 */
	public int getHora() {
		return hora;
	}

	/**
		 * entra como parametro hora  comprueba s esta dentro de los limites
		 * si lo esta settea el valor de hora a la ariable privada
		 * @param hora
		 */
		public void setHora(int hora) throws NegativeHoraException {
			if (hora<0){
				throw new NegativeHoraException();
			}else {
				this.hora=hora;
			}
		}

	/**
	 * obtiene el valor de minuto
	 * 
	 * @return devuelve el valor de minuto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
		 * settea el valor de minuto a la variable privada
		 * @param minuto
		 */
		public void setMinuto(int minuto)throws NegativeMinuteException{
			if (minuto<0){
				throw new NegativeMinuteException();
			}else {
				this.minuto=minuto;
			}
		}

	/**
	 * obtiene el valor de segundo
	 * 
	 * @return
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
		 * si cumple la funcion del if settea el valor de segunfo a la variable privada
		 * @param segundo
		 */
		public void setSegundo(int segundo)throws NegativeSecondException {
			if (segundo<0){
				throw new NegativeSecondException();
			}else {
				this.segundo=segundo;
			}	
		}

	public void incrementarSegundos(int incremento) {

		// Repetimos el bucle tantas veces como segundos en el incremento
		for (int i = 1; i <= incremento; i++) {

			// Aumentamos en 1 los segundos
			segundo++;
			// Si los segundos son 60
			if (segundo == 60) {
				// Cambiamos los segundos a 0
				segundo = 0;
				// Añadimos 1 minuto
				minuto++;
			}
			// Si los minutos son 60
			if (minuto == 60) {
				// cambiamos los minutos a 0
				minuto = 0;
				// Aumentamos 1 hora
				hora++;
			}
			// Si la hora es 24
			if (hora == 24) {

				// Cambiamos la hora a 0
				hora = 0;
			}
		}
	}

}
