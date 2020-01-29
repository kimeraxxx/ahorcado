package poo_v1;

public class Parcial {
	private char parcial[] ;

	
	public char[] getParcial() {
		return parcial;
	}

	public Parcial(int longitud) {
		super();
		this.parcial = new char[longitud];
		crearPalabraParcial();
	}

	private void crearPalabraParcial() {
		for (int i = 0; i < parcial.length; i++) {
			this.parcial[i] = '_';
		}
	}

	/**
	 * examina si la palabra parcial ha sido completada, retornando un valor boolean
	 * que confirma o desmiente este evento
	 * 
	 * @param parcial
	 * @return
	 */
	public boolean comprobarPalabraCompletada() {
		boolean completada = true;
		for (int i = 0; i < this.parcial.length && completada; i++) {
			if (this.parcial[i] == '_')
				completada = false;
		}
		return completada;
	}
}
