

public class Ahorcado {

	// Propiedades de la clase ahorcado
	private char secreta[] = Utiles.pedirPalabraSecreta();
	private Parcial parcial = new Parcial(secreta.length);
	private int numeroFallos = 0;

	public void play() {
		boolean acertado = false;
		do {
			char letra = Utiles.pedirLetra();
			if (!this.comprobarLetraPalabra(letra)) {
				this.numeroFallos = this.incrementarFallo();
			} else {
				acertado = this.parcial.comprobarPalabraCompletada();
			}
			this.mostrarPalabraParcialYFallos();
		} while (numeroFallos < 6 && !acertado);
		muestraEstado(acertado);

	}

	private void muestraEstado(boolean acertado) {
		if (acertado)
			System.out.println("enhorabuena");
		else
			System.out.println("has perdido");
	}

	private  void mostrarPalabraParcialYFallos() {
		// Aqui comienza
		for (int i = 0; i < this.secreta.length; i++) {
			System.out.print(this.parcial.getParcial()[i] + " ");
		}
		System.out.println();
		// Aqui termina
		System.out.println("Numero Fallos " + this.numeroFallos);
	}

	private  int incrementarFallo() {
		return ++this.numeroFallos;
	}

	/**
	 * cuenta con la palabra secreta y la letra actual y además con otro vector de
	 * letras llamado parcial, de igual tamaño que palabra, que comienza lleno de
	 * '_'. Estos '_' serán sustituidos por las letras que vamos adivinando.
	 * Retorna este vector de aciertos junto con una respuesta booleana que nos dice
	 * si la letra actual se encontraba en la palabra secreta o no.
	 * 
	 * @param palabra
	 * @param parcial
	 * @param letra
	 * @return
	 */
	private boolean comprobarLetraPalabra(char letra) {
		boolean existe = false;
		for (int i = 0; i < this.secreta.length; i++) {
			if (this.parcial.getParcial()[i] == '_' && this.secreta[i] == letra) {
				this.parcial.getParcial()[i] = this.secreta[i];
				existe = true;
			}
		}
		return existe;
	}


}
