package starWars;

import java.util.Random;

/**
 * 
 * La clase Sith contiene uno de los personajes con sus atributos y metodos, el
 * cual se enfrenta a otro creado en otra clase llamada Jedi
 * 
 * @author Matias Ivan Pencef Perez.
 * @version 1.0
 * @since 28/03/2024
 */
public class Sith {

	private String nombre;
	private int salud;
	private int fuerza;
	private Random random;
	private String tipoEspada;

	/**
	 * Parametros necesarios para la creacion del objeto Sith.
	 * 
	 * @param nombre
	 * @param salud
	 * @param fuerza
	 * @param tipoEspada
	 */

	public Sith(String nombre, int salud, int fuerza, String tipoEspada) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.fuerza = fuerza;
		this.tipoEspada = tipoEspada;
		this.random = new Random();
	}

	/**
	 * 
	 * @return Permite obtener el contenido de la variable nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre. Permite modificar el valor del atributo nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return Permite obtener el contenido de la variable salud.
	 */
	public int getSalud() {
		return salud;
	}

	/**
	 * 
	 * @param salud. Permite modificar el valor del atributo salud.
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}

	/**
	 * 
	 * @return Permite obtener el contenido de la variable fuerza.
	 */
	public int getFuerza() {
		return fuerza;
	}

	/**
	 * 
	 * @param fuerza. Permite modificar el valor del atributo fuerza.
	 */
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	/**
	 * 
	 * @return Permite obtener el contenido de la variable tipoEspada.
	 */
	public String getTipoEspada() {
		return tipoEspada;
	}

	/**
	 * 
	 * @param tipoEspada. Permite modificar el valor del atributo tipoEspada.
	 */
	public void setTipoEspada(String tipoEspada) {
		this.tipoEspada = tipoEspada;
	}

	/**
	 * Metodo toString, permite ver los datos del objeto Sith como una cadena de
	 * Strings.
	 */
	@Override
	public String toString() {
		return "Sith [nombre=" + nombre + ", salud=" + salud + ", fuerza=" + fuerza + ", tipoEspada=" + tipoEspada
				+ "]";
	}

	/**
	 * El metodo imprimir, muestra por pantalla todos los datos de el objeto Sith.
	 */
	public void imprimir() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Salud: " + this.salud);
		System.out.println("Fuerza: " + this.fuerza);
		System.out.println("Tipo de capa: " + this.tipoEspada);
	}

	/**
	 * @param jedi. Este parametro es un objeto Jedi al que el Sith le infringe un
	 *              dano, deberia verse reducida la salud del Jedi.
	 * @deprecated Este metodo esta anticuado, deberia dejar de usarse, en su lugar
	 *             se ha creado un metodo nuevo.
	 * @see atacarNuevo
	 */
	public void atacar(Jedi jedi) {
		int danyo = random.nextInt(30) + 30; // Crea numero aleatorio entre 30 y 60.
		System.out.println(this.nombre + " ataca a " + jedi.getNombre() + "!");
		jedi.recibirAtaque(danyo);
	}

	/**
	 * @param jedi. Este parametro es un objeto Jedi al que el Sith le infringe un
	 *              dano, mejora el antiguo metodo atacar, implementando un golpe
	 *              critico, esta desde la version 1.2.
	 * @since 1.2.
	 */
	public void atacarNuevo(Jedi jedi) {
		int danyo = calcularDanyo();
		System.out.println(this.nombre + " ataca a " + jedi.getNombre() + "!");
		if (esGolpeCritico()) {
			danyo += 20; // Daño adicional por golpe crítico
			System.out.println("¡Golpe crítico!");
		}
		jedi.recibirAtaque(danyo);
	}

	/**
	 * Este metodo calcula el dano, (Numero que se restara a la salud del Jedi).
	 * 
	 * @return Devuelve dano aleatorio, un numero entre 30 y 60.
	 */
	private int calcularDanyo() {
		return random.nextInt(31) + 30; // Daño aleatorio entre 30 y 60
	}

	/**
	 * Este metodo gestiona la probabilidad de un golpe critico.
	 * 
	 * @return Devuelve la probabilidad de un 20% de golpe critico.
	 */
	private boolean esGolpeCritico() {
		return random.nextDouble() < 0.2; // Probabilidad de 20% de golpe critico
	}

	/**
	 * @param danyo. Este parametro recoje el dano recibido en el ataque del Jedi
	 *               hacia el objeto Sith, deberia restar salud a el Sith.
	 */
	public void recibirAtaque(int danyo) {
		this.salud -= danyo;
		if (this.salud <= 0) {
			System.out.println(this.nombre + " ha sido derrotado.");
		} else {
			System.out.println(this.nombre + " recibe " + danyo + " puntos de daño. Salud restante: " + this.salud);
		}
	}

}
