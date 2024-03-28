package starWars;

import java.util.Random;

/**
 * La clase Jedi contiene uno de los personajes con sus atributos y metodos, el
 * cual se enfrenta a otro objeto creado en otra clase llamada Sith.
 * 
 * @author Matias Ivan Pencef Perez.
 * @version 1.0
 * @since 28/03/2024
 */
public class Jedi {

	private String nombre;
	private int salud;
	private int fuerza;
	private Random random;
	private String tipoCapa;

	/**
	 * Estos son los parametros necesarios para la creacion del objeto Jedi.
	 * 
	 * @param nombre
	 * @param salud
	 * @param fuerza
	 * @param tipoCapa
	 */
	public Jedi(String nombre, int salud, int fuerza, String tipoCapa) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.fuerza = fuerza;
		this.tipoCapa = tipoCapa;
		this.random = new Random();
	}

	/**
	 * @return Permite obtener el contenido de la variable nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre. Permite modificar el atributo nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return Permite obtener el contenido de la variable salud.
	 */
	public int getSalud() {
		return salud;
	}

	/**
	 * @param salud. Permite modificar el valor del atributo salud.
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}

	/**
	 * @return Permite obtener el contenido de la variable fuerza.
	 */
	public int getFuerza() {
		return fuerza;
	}

	/**
	 * @param fuerza. Permite modificar el valor del atributo fuerza.
	 */
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	/**
	 * @return Permite obtener el contenido de la variable tipoCapa.
	 */
	public String getTipoCapa() {
		return tipoCapa;
	}

	/**
	 * @param tipoCapa. Permite modificar el valor del atributo tipoCapa.
	 */
	public void setTipoCapa(String tipoCapa) {
		this.tipoCapa = tipoCapa;
	}

	/**
	 * Metodo toString, permite ver los datos del objeto Jedi como una cadena de
	 * Strings.
	 */
	@Override
	public String toString() {
		return "Jedi [nombre=" + nombre + ", salud=" + salud + ", fuerza=" + fuerza + ", tipoCapa=" + tipoCapa + "]";
	}

	/**
	 * El metodo imprimir, muestra por pantalla todos los datos de el objeto Jedi.
	 */
	public void imprimir() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Salud: " + this.salud);
		System.out.println("Fuerza: " + this.fuerza);
		System.out.println("Tipo de capa: " + this.tipoCapa);
	}

	/**
	 * @param sith. Este parametro es un objeto Sith al que el Jedi le infringe un
	 *              dano, deberia verse reducida la salud del Sith.
	 * @deprecated Este metodo esta anticuado, deberia dejar de usarse, en su lugar
	 *             se ha creado un metodo nuevo.
	 * @see atacarNuevo
	 */
	public void atacar(Sith sith) {
		int danyo = random.nextInt(30) + 30; // Crea numero aleatorio entre 30 y 60.
		System.out.println(this.nombre + " ataca a " + sith.getNombre() + "!");
		sith.recibirAtaque(danyo);
	}

	/**
	 * @param sith. Este parametro es un objeto Sith al que el Jedi le infringe un
	 *              dano, mejora el antiguo metodo atacar, implementando un golpe
	 *              critico, esta desde la version 1.2.
	 * @since 1.2.
	 */
	public void atacarNuevo(Sith sith) {
		int danyo = calcularDanyo();
		System.out.println(this.nombre + " ataca a " + sith.getNombre() + "!");
		if (esGolpeCritico()) {
			danyo += 20; // Dano adicional por golpe critico
			System.out.println("¡Golpe crítico!");
		}
		sith.recibirAtaque(danyo);
	}

	/**
	 * Este metodo calcula el dano, (Numero que se restara a la salud del Sith).
	 * 
	 * @return Devuelve dano aleatorio, un numero entre 30 y 60.
	 */
	private int calcularDanyo() {
		return random.nextInt(31) + 30;
	}

	/**
	 * Este metodo gestiona la probabilidad de un golpe critico.
	 * 
	 * @return Devuelve la probabilidad de un 20% de golpe critico.
	 */
	private boolean esGolpeCritico() {
		return random.nextDouble() < 0.2;
	}

	/**
	 * @param danyo. Este parametro recoje el dano recibido en el ataque del Sith
	 *               hacia el objeto Jedi, deberia restar salud a el Jedi.
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
