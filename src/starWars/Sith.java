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
		this.random = new Random();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public String getTipoEspada() {
		return tipoEspada;
	}

	public void setTipoEspada(String tipoEspada) {
		this.tipoEspada = tipoEspada;
	}

	@Override
	public String toString() {
		return "Sith [nombre=" + nombre + ", salud=" + salud + ", fuerza=" + fuerza + ", tipoEspada=" + tipoEspada
				+ "]";
	}

	public void imprimir() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Salud: " + this.salud);
		System.out.println("Fuerza: " + this.fuerza);
		System.out.println("Tipo de capa: " + this.tipoEspada);
	}

	public void atacar(Jedi jedi) {
		int danyo = random.nextInt(30) + 30; // Crea numero aleatorio entre 30 y 60.
		System.out.println(this.nombre + " ataca a " + jedi.getNombre() + "!");
		jedi.recibirAtaque(danyo);
	}

	public void recibirAtaque(int dano) {
		this.salud -= dano;
		if (this.salud <= 0) {
			System.out.println(this.nombre + " ha sido derrotado.");
		} else {
			System.out.println(this.nombre + " recibe " + dano + " puntos de daño. Salud restante: " + this.salud);
		}
	}

}
