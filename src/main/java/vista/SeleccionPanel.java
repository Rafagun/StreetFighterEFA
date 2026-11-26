package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SeleccionPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private static final Color GRIS_CLARO = new Color(200, 200, 200);
	private static final Color GRIS_CELDA = new Color(45, 45, 45);
	private static final Color GRIS_BORDE = new Color(110, 110, 110);

	private static final String ESTILO_LUCHADOR = "arc: 10; borderWidth: 3; borderColor: #6E6E6E; focusedBorderColor: #FFFFFF; focusWidth: 0; innerFocusWidth: 2";
	private static final String ESTILO_LUCHADOR_MARCADO = "arc: 10; borderWidth: 5; borderColor: #FF8C00; focusedBorderColor: #FF8C00; focusWidth: 0; innerFocusWidth: 2";

	private static final String[] NOMBRES = { "Ryu", "Ken", "Guile", "Chun-Li", "Honda", "Dhalsim", "Blanka", "Vega",
			"Zangief", "Dee Jay", "T.Hawk", "Cammy", "Balrog", "Sagat", "M.Bison" };

	private static final int FILAS = 3;
	private static final int COLUMNAS = 5;
	private static final int X_REJILLA = 200;
	private static final int Y_REJILLA = 120;
	private static final int ANCHO_CELDA = 165;
	private static final int ALTO_CELDA = 180;
	private static final int HUECO = 12;

	private JLabel lblSelecciona;
	private JLabel lblTurno;
	private JPanel pnlRejilla;
	private JButton[] btnLuchadores;
	private JLabel lblPotencia;
	private JLabel lblValorPotencia;
	private JLabel lblVelocidad;
	private JLabel lblValorVelocidad;
	private JLabel lblFisico;
	private JLabel lblValorFisico;
	private JButton btnSeleccionar;
	private JButton btnVolver;

	public SeleccionPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(EstilosVista.ANCHO_VENTANA, EstilosVista.ALTO_VENTANA));

		lblSelecciona = crearTitulo("SELECCIONA PERSONAJE", 40, 25, 460);
		lblTurno = crearTitulo("JUGADOR", 1200, 25, 250);

		pnlRejilla = new JPanel(new GridLayout(FILAS, COLUMNAS, HUECO, HUECO));
		pnlRejilla.setOpaque(false);
		pnlRejilla.setBounds(X_REJILLA, Y_REJILLA, COLUMNAS * ANCHO_CELDA + (COLUMNAS - 1) * HUECO,
				FILAS * ALTO_CELDA + (FILAS - 1) * HUECO);
		add(pnlRejilla);

		btnLuchadores = new JButton[NOMBRES.length];
		for (int i = 0; i < NOMBRES.length; i++) {
			JButton boton = new JButton(NOMBRES[i]);
			boton.setFont(EstilosVista.FUENTE_TEXTO_NEGRITA);
			boton.setBackground(GRIS_CELDA);
			boton.setForeground(EstilosVista.BLANCO);
			boton.setVerticalTextPosition(SwingConstants.BOTTOM);
			boton.setHorizontalTextPosition(SwingConstants.CENTER);
			boton.putClientProperty("FlatLaf.style", ESTILO_LUCHADOR);
			pnlRejilla.add(boton);
			btnLuchadores[i] = boton;
		}
		//btnLuchadores[4].putClientProperty("FlatLaf.style", ESTILO_LUCHADOR_MARCADO);

		lblPotencia = crearCabecera("POTENCIA", 1200, 130);
		lblValorPotencia = crearCelda("40", 1200, 130);

		lblVelocidad = crearCabecera("VELOCIDAD", 1200, 290);
		lblValorVelocidad = crearCelda("20", 1200, 290);

		lblFisico = crearCabecera("FÍSICO", 1200, 450);
		lblValorFisico = crearCelda("30", 1200, 450);

		btnSeleccionar = new JButton("SELECCIONAR");
		btnSeleccionar.setFont(EstilosVista.FUENTE_BOTON_PEQUENO);
		btnSeleccionar.setBackground(EstilosVista.AZUL);
		btnSeleccionar.setForeground(EstilosVista.BLANCO);
		btnSeleccionar.putClientProperty("FlatLaf.style", EstilosVista.ESTILO_BOTON_COMBATE);
		btnSeleccionar.setBounds(1180, 650, 270, EstilosVista.ALTO_BOTON_PEQUENO);
		add(btnSeleccionar);

		btnVolver = new JButton("Atrás");
		btnVolver.setFont(EstilosVista.FUENTE_BOTON_PEQUENO);
		btnVolver.setBackground(EstilosVista.MELOCOTON);
		btnVolver.setForeground(EstilosVista.NEGRO);
		btnVolver.putClientProperty("FlatLaf.style", EstilosVista.ESTILO_BOTON);
		btnVolver.setBounds(30, 665, 150, 60);
		add(btnVolver);
	}

	private JLabel crearTitulo(String texto, int x, int y, int ancho) {
		JLabel titulo = new JLabel(texto, SwingConstants.CENTER);
		titulo.setFont(EstilosVista.FUENTE_BOTON_PEQUENO);
		titulo.setForeground(EstilosVista.NEGRO);
		titulo.setOpaque(true);
		titulo.setBackground(GRIS_CLARO);
		titulo.setBorder(BorderFactory.createLineBorder(EstilosVista.NEGRO, 3));
		titulo.setBounds(x, y, ancho, 65);
		add(titulo);
		return titulo;
	}

	private JLabel crearCabecera(String texto, int x, int y) {
		JLabel cabecera = new JLabel(texto, SwingConstants.CENTER);
		cabecera.setFont(EstilosVista.FUENTE_TEXTO_NEGRITA);
		cabecera.setForeground(EstilosVista.AMARILLO);
		cabecera.setOpaque(true);
		cabecera.setBackground(GRIS_CELDA);
		cabecera.setBorder(BorderFactory.createMatteBorder(3, 3, 0, 3, GRIS_BORDE));
		cabecera.setBounds(x, y, 250, 50);
		add(cabecera);
		return cabecera;
	}

	private JLabel crearCelda(String texto, int x, int y) {
		JLabel celda = new JLabel(texto, SwingConstants.CENTER);
		celda.setFont(EstilosVista.FUENTE_NUMERO);
		celda.setForeground(EstilosVista.BLANCO);
		celda.setOpaque(true);
		celda.setBackground(GRIS_CELDA);
		celda.setBorder(BorderFactory.createMatteBorder(0, 3, 3, 3, GRIS_BORDE));
		celda.setBounds(x, y + 50, 250, 80);
		add(celda);
		return celda;
	}

	public JLabel getLblTurno() {
		return lblTurno;
	}

	public JButton[] getBtnLuchadores() {
		return btnLuchadores;
	}

	public JLabel getLblValorPotencia() {
		return lblValorPotencia;
	}

	public JLabel getLblValorVelocidad() {
		return lblValorVelocidad;
	}

	public JLabel getLblValorFisico() {
		return lblValorFisico;
	}

	public JButton getBtnSeleccionar() {
		return btnSeleccionar;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}
}
