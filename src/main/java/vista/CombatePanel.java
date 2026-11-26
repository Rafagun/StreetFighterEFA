package vista;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class CombatePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private static final Color GRIS_MARCO = new Color(110, 110, 110);
	private static final Color GRIS_OSCURO = new Color(45, 45, 45);

	private JProgressBar barVidaJugador;
	private JProgressBar barVidaCpu;
	private JLabel lblKO;
	private JLabel lblVidaJugador;
	private JLabel lblNombreJugador;
	private JLabel lblRonda;
	private JLabel lblNombreCpu;
	private JLabel lblVidaCpu;
	private JLabel lblImagenJugador;
	private JLabel lblImagenCpu;
	private JButton btnAtacar;
	private JButton btnDefender;
	private JButton btnDescansar;
	private JButton btnVolver;
	private JLabel lblCansancioJugador;
	private JProgressBar barCansancioJugador;
	private JProgressBar barCansancioCpu;
	private JLabel lblCansancioCpu;

	public CombatePanel() {
		setLayout(null);
		setPreferredSize(new Dimension(EstilosVista.ANCHO_VENTANA, EstilosVista.ALTO_VENTANA));

		barVidaJugador = crearBarraVida(90, 30);
		barVidaJugador.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		barVidaJugador.setValue(34);

		lblKO = new JLabel("KO", SwingConstants.CENTER);
		lblKO.setFont(EstilosVista.FUENTE_NUMERO);
		lblKO.setForeground(EstilosVista.ROJO);
		lblKO.setOpaque(true);
		lblKO.setBackground(GRIS_OSCURO);
		lblKO.setBorder(BorderFactory.createLineBorder(EstilosVista.AZUL_OSCURO, 4));
		lblKO.setBounds(700, 15, 100, 70);
		add(lblKO);

		barVidaCpu = crearBarraVida(810, 30);
		barVidaCpu.setValue(61);

		lblVidaJugador = crearNumero("34", 90, 100);
		lblNombreJugador = crearNombre("KEN", SwingConstants.LEFT, 220, 100);

		lblRonda = new JLabel("1", SwingConstants.CENTER);
		lblRonda.setFont(EstilosVista.FUENTE_NUMERO);
		lblRonda.setForeground(EstilosVista.ROJO);
		lblRonda.setOpaque(true);
		lblRonda.setBackground(EstilosVista.BLANCO);
		lblRonda.setBorder(BorderFactory.createLineBorder(EstilosVista.AZUL, 4));
		lblRonda.setBounds(700, 100, 100, 70);
		add(lblRonda);

		lblNombreCpu = crearNombre("BLANKA", SwingConstants.RIGHT, 880, 100);
		lblVidaCpu = crearNumero("61", 1300, 100);

		lblImagenJugador = crearImagen(90, 210);
		lblImagenCpu = crearImagen(970, 210);

		int xBotones = (EstilosVista.ANCHO_VENTANA - EstilosVista.ANCHO_BOTON_COMBATE) / 2;
		int separacion = EstilosVista.ALTO_BOTON_COMBATE + EstilosVista.SEPARACION_BOTONES;
		btnAtacar = crearBotonAccion("ATACAR", xBotones, 290, EstilosVista.ROJO);
		btnDefender = crearBotonAccion("DEFENDER", xBotones, 290 + separacion, EstilosVista.AZUL);
		btnDescansar = crearBotonAccion("DESCANSAR", xBotones, 290 + separacion * 2, EstilosVista.VERDE);

		btnVolver = new JButton("Atrás");
		btnVolver.setFont(EstilosVista.FUENTE_BOTON_PEQUENO);
		btnVolver.setBackground(EstilosVista.MELOCOTON);
		btnVolver.setForeground(EstilosVista.NEGRO);
		btnVolver.putClientProperty("FlatLaf.style", EstilosVista.ESTILO_BOTON);
		btnVolver.setBounds(30, 665, 150, 60);
		add(btnVolver);

		lblCansancioJugador = crearCansancio("27", SwingConstants.RIGHT, 200, 670);
		barCansancioJugador = crearBarraCansancio(290, 685);
		barCansancioJugador.setValue(27);

		barCansancioCpu = crearBarraCansancio(770, 685);
		barCansancioCpu.setValue(83);
		lblCansancioCpu = crearCansancio("83", SwingConstants.LEFT, 1220, 670);
	}

	private JProgressBar crearBarraVida(int x, int y) {
		JProgressBar barra = new JProgressBar(0, 100);
		barra.setForeground(EstilosVista.AZUL);
		barra.setBackground(EstilosVista.AMARILLO);
		barra.setBorder(BorderFactory.createLineBorder(EstilosVista.AZUL_OSCURO, 3));
		barra.setBounds(x, y, 600, 40);
		add(barra);
		return barra;
	}

	private JProgressBar crearBarraCansancio(int x, int y) {
		JProgressBar barra = new JProgressBar(0, 100);
		barra.setForeground(EstilosVista.BLANCO);
		barra.setBackground(EstilosVista.AZUL_OSCURO);
		barra.setBorder(BorderFactory.createLineBorder(EstilosVista.AZUL, 2));
		barra.setBounds(x, y, 430, 22);
		add(barra);
		return barra;
	}

	private JLabel crearNumero(String texto, int x, int y) {
		JLabel numero = new JLabel(texto, SwingConstants.CENTER);
		numero.setFont(EstilosVista.FUENTE_NUMERO);
		numero.setForeground(EstilosVista.AZUL_OSCURO);
		numero.setOpaque(true);
		numero.setBackground(EstilosVista.BLANCO);
		numero.setBorder(BorderFactory.createLineBorder(EstilosVista.AZUL, 4));
		numero.setBounds(x, y, 110, 70);
		add(numero);
		return numero;
	}

	private JLabel crearNombre(String texto, int alineacion, int x, int y) {
		JLabel nombre = new JLabel(texto, alineacion);
		nombre.setFont(EstilosVista.FUENTE_TITULO);
		nombre.setForeground(EstilosVista.AMARILLO);
		nombre.setBounds(x, y, 400, 70);
		add(nombre);
		return nombre;
	}

	private JLabel crearImagen(int x, int y) {
		JLabel imagen = new JLabel();
		imagen.setHorizontalAlignment(SwingConstants.CENTER);
		imagen.setBorder(BorderFactory.createLineBorder(GRIS_MARCO, 4));
		imagen.setBounds(x, y, 440, 430);
		add(imagen);
		return imagen;
	}

	private JButton crearBotonAccion(String texto, int x, int y, Color color) {
		JButton boton = new JButton(texto);
		boton.setFont(EstilosVista.FUENTE_BOTON_PEQUENO);
		boton.setBackground(color);
		boton.setForeground(EstilosVista.BLANCO);
		boton.putClientProperty("FlatLaf.style", EstilosVista.ESTILO_BOTON_COMBATE);
		boton.setBounds(x, y, EstilosVista.ANCHO_BOTON_COMBATE, EstilosVista.ALTO_BOTON_COMBATE);
		add(boton);
		return boton;
	}

	private JLabel crearCansancio(String texto, int alineacion, int x, int y) {
		JLabel cansancio = new JLabel(texto, alineacion);
		cansancio.setFont(EstilosVista.FUENTE_BOTON_PEQUENO);
		cansancio.setForeground(EstilosVista.BLANCO);
		cansancio.setBounds(x, y, 80, 50);
		add(cansancio);
		return cansancio;
	}

	public JProgressBar getBarVidaJugador() {
		return barVidaJugador;
	}

	public JProgressBar getBarVidaCpu() {
		return barVidaCpu;
	}

	public JLabel getLblKO() {
		return lblKO;
	}

	public JLabel getLblVidaJugador() {
		return lblVidaJugador;
	}

	public JLabel getLblNombreJugador() {
		return lblNombreJugador;
	}

	public JLabel getLblRonda() {
		return lblRonda;
	}

	public JLabel getLblNombreCpu() {
		return lblNombreCpu;
	}

	public JLabel getLblVidaCpu() {
		return lblVidaCpu;
	}

	public JLabel getLblImagenJugador() {
		return lblImagenJugador;
	}

	public JLabel getLblImagenCpu() {
		return lblImagenCpu;
	}

	public JButton getBtnAtacar() {
		return btnAtacar;
	}

	public JButton getBtnDefender() {
		return btnDefender;
	}

	public JButton getBtnDescansar() {
		return btnDescansar;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JLabel getLblCansancioJugador() {
		return lblCansancioJugador;
	}

	public JProgressBar getBarCansancioJugador() {
		return barCansancioJugador;
	}

	public JProgressBar getBarCansancioCpu() {
		return barCansancioCpu;
	}

	public JLabel getLblCansancioCpu() {
		return lblCansancioCpu;
	}
}
