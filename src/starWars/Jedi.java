package starWars;

import java.util.Random;

public class Jedi {

	private String nombre;
	private int salud;
	private int fuerza;
	private Random random;
	private String tipoCapa;

	public Jedi(String nombre, int salud, int fuerza, String tipoCapa) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.fuerza = fuerza;
		this.tipoCapa = tipoCapa;
	}

}
