package modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private String contrasenia;
	private int victorias;
	private int derrotas;
	private List<Luchador> desbloqueados;

	public Usuario() {

	}

	public Usuario(String nombre, String contrasenia) {

		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.victorias = 0;
		this.derrotas = 0;
		this.desbloqueados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public List<Luchador> getDesbloqueados() {
		return desbloqueados;
	}

	public void setDesbloqueados(List<Luchador> desbloqueados) {
		this.desbloqueados = desbloqueados;
	}

}
