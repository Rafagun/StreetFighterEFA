package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private static final int X_BOTONES = 100;
	private static final int Y_MODOS = 150;
	private static final int Y_OPCIONES = 510;

	private JButton btnHistoria;
	private JButton btnEnfrentamiento;
	private JButton btnPersonajes;
	private JButton btnAyuda;
	private JLabel lblLogo;

	public MenuPanel() {
		setSize(EstilosVista.ANCHO_VENTANA, EstilosVista.ALTO_VENTANA);
		setLayout(null);

		int ancho = EstilosVista.ANCHO_BOTON_MENU;
		int altoGrande = EstilosVista.ALTO_BOTON_GRANDE;
		int altoPequeno = EstilosVista.ALTO_BOTON_PEQUENO;
		int separacion = EstilosVista.SEPARACION_BOTONES;

		btnHistoria = crearBoton("Modo HISTORIA", EstilosVista.AMARILLO, EstilosVista.FUENTE_BOTON_GRANDE);
		btnHistoria.setBounds(X_BOTONES, Y_MODOS, ancho, altoGrande);
		add(btnHistoria);

		btnEnfrentamiento = crearBoton("ENFRENTAMIENTO", EstilosVista.AMARILLO,
				EstilosVista.FUENTE_BOTON_GRANDE);
		btnEnfrentamiento.setBounds(X_BOTONES, Y_MODOS + altoGrande + separacion, ancho, altoGrande);
		add(btnEnfrentamiento);

		btnPersonajes = crearBoton("Descripción de Personajes", EstilosVista.MELOCOTON,
				EstilosVista.FUENTE_BOTON_PEQUENO);
		btnPersonajes.setBounds(X_BOTONES, Y_OPCIONES, ancho, altoPequeno);
		add(btnPersonajes);

		btnAyuda = crearBoton("Información o Ayuda", EstilosVista.MELOCOTON,
				EstilosVista.FUENTE_BOTON_PEQUENO);
		btnAyuda.setBounds(X_BOTONES, Y_OPCIONES + altoPequeno + separacion, ancho, altoPequeno);
		add(btnAyuda);

		lblLogo = new JLabel("STREET FIGHTER");
		lblLogo.setFont(EstilosVista.FUENTE_LOGO);
		lblLogo.setForeground(EstilosVista.AMARILLO);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(730, 120, 700, 480);
		add(lblLogo);
	}

	private JButton crearBoton(String texto, Color fondo, Font fuente) {
		JButton boton = new JButton(texto);
		boton.setFont(fuente);
		boton.setBackground(fondo);
		boton.setForeground(EstilosVista.NEGRO);
		boton.setHorizontalAlignment(SwingConstants.LEFT);
		boton.putClientProperty("FlatLaf.style", EstilosVista.ESTILO_BOTON);
		return boton;
	}

}
