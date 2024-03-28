package starWars;

import java.util.Random;

public class Sith {

	private String nombre;
	private int salud;
	private int fuerza;
	private Random random;
	private String tipoEspada;

	public Sith(String nombre, int salud, int fuerza, String tipoEspada) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.fuerza = fuerza;
		this.tipoEspada = tipoEspada;
	}

}
