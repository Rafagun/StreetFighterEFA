package modelo;

public class LuchadorEnCombate {

	private Luchador luchador;
	private int vida;
	private int cansancio;
	private String ultimaAccion;
	private int ultimoGolpe;
	private int ultimoDanioRecibido;
	private boolean haFallado;
	private int danioTotal;

	public LuchadorEnCombate(Luchador luchador) {

		this.luchador = luchador;
		this.vida = 100;
		this.cansancio = 100;
		this.ultimaAccion = "";
		this.ultimoGolpe = 0;
		this.ultimoDanioRecibido = 0;
		this.haFallado = false;
		this.danioTotal = 0;

	}

	public Luchador getLuchador() {
		return luchador;
	}

	public void setLuchador(Luchador luchador) {
		this.luchador = luchador;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getCansancio() {
		return cansancio;
	}

	public void setCansancio(int cansancio) {
		this.cansancio = cansancio;
	}

	public String getUltimaAccion() {
		return ultimaAccion;
	}

	public void setUltimaAccion(String ultimaAccion) {
		this.ultimaAccion = ultimaAccion;
	}

	public int getUltimoGolpe() {
		return ultimoGolpe;
	}

	public void setUltimoGolpe(int ultimoGolpe) {
		this.ultimoGolpe = ultimoGolpe;
	}

	public int getUltimoDanioRecibido() {
		return ultimoDanioRecibido;
	}

	public void setUltimoDanioRecibido(int ultimoDanioRecibido) {
		this.ultimoDanioRecibido = ultimoDanioRecibido;
	}

	public boolean isHaFallado() {
		return haFallado;
	}

	public void setHaFallado(boolean haFallado) {
		this.haFallado = haFallado;
	}

	public int getDanioTotal() {
		return danioTotal;
	}

	public void setDanioTotal(int danioTotal) {
		this.danioTotal = danioTotal;
	}

	public void resetValores() {

		this.vida = 100;
		this.cansancio = 100;
		this.ultimaAccion = "";
		this.ultimoGolpe = 0;
		this.ultimoDanioRecibido = 0;
		this.haFallado = false;
		this.danioTotal = 0;

	}

}
