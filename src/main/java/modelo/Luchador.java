package modelo;

public class Luchador {

	private String nombre;
	private String nacionalidad;
	private int edad;
	private double estatura;
	private int peso;
	private int potencia;
	private int velocidad;
	private int fisico;
	private String descripcion;
	private String rutaImagen;

	public Luchador() {

	}

	public Luchador(String nombre, String nacionalidad, int edad, double estatura, int peso, int potencia,
			int velocidad, int fisico, String descripcion, String rutaImagen) {

		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.fisico = fisico;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFisico() {
		return fisico;
	}

	public void setFisico(int fisico) {
		this.fisico = fisico;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
