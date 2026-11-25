package modelo;

public class Combate {

	private Luchador jugador;
	private Luchador cpu;
	private int ronda;

	public Combate(Luchador jugador, Luchador cpu) {

		this.jugador = jugador;
		this.cpu = cpu;
		this.ronda = 0;
	}

	public Luchador getJugador() {
		return jugador;
	}

	public void setJugador(Luchador jugador) {
		this.jugador = jugador;
	}

	public Luchador getCpu() {
		return cpu;
	}

	public void setCpu(Luchador cpu) {
		this.cpu = cpu;
	}

	public int getRonda() {
		return ronda;
	}

	public void setRonda(int ronda) {
		this.ronda = ronda;
	}

}
