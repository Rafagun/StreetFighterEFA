package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public static final String CMD_HISTORIA = "HISTORIA";
	public static final String CMD_ENFRENTAMIENTO = "ENFRENTAMIENTO";
	public static final String CMD_PERSONAJES = "PERSONAJES";
	public static final String CMD_AYUDA = "AYUDA";

	private static final Color AMARILLO = new Color(255, 192, 0);
	private static final Color MELOCOTON = new Color(248, 203, 173);

	private static final int X_BOTONES = 100;
	private static final int ANCHO_BOTONES = 540;

	private JButton btnHistoria;
	private JButton btnEnfrentamiento;
	private JButton btnPersonajes;
	private JButton btnAyuda;
	private JLabel lblLogo;

	public MenuPanel() {
		setSize(1500, 800);
		setLayout(null);

		btnHistoria = crearBoton("Modo HISTORIA", CMD_HISTORIA, KeyEvent.VK_H, AMARILLO, 32);
		btnHistoria.setBounds(X_BOTONES, 150, ANCHO_BOTONES, 95);
		add(btnHistoria);

		btnEnfrentamiento = crearBoton("ENFRENTAMIENTO", CMD_ENFRENTAMIENTO, KeyEvent.VK_E, AMARILLO, 32);
		btnEnfrentamiento.setBounds(X_BOTONES, 265, ANCHO_BOTONES, 95);
		add(btnEnfrentamiento);

		btnPersonajes = crearBoton("Descripción de Personajes", CMD_PERSONAJES, KeyEvent.VK_D, MELOCOTON, 24);
		btnPersonajes.setBounds(X_BOTONES, 510, ANCHO_BOTONES, 70);
		add(btnPersonajes);

		btnAyuda = crearBoton("Información o Ayuda", CMD_AYUDA, KeyEvent.VK_I, MELOCOTON, 24);
		btnAyuda.setBounds(X_BOTONES, 600, ANCHO_BOTONES, 70);
		add(btnAyuda);

		lblLogo = new JLabel("STREET FIGHTER");
		lblLogo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 72));
		lblLogo.setForeground(AMARILLO);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(730, 120, 700, 480);
		add(lblLogo);
	}

	private JButton crearBoton(String texto, String comando, int teclaAtajo, Color fondo, int tamanioLetra) {
		JButton boton = new JButton(texto);
		boton.setActionCommand(comando);
		boton.setMnemonic(teclaAtajo);
		boton.setFont(new Font("Tahoma", Font.BOLD, tamanioLetra));
		boton.setBackground(fondo);
		boton.setForeground(Color.BLACK);
		boton.setHorizontalAlignment(SwingConstants.LEFT);
		boton.putClientProperty("FlatLaf.style",
				"arc: 0; borderWidth: 2; borderColor: #000000; focusedBorderColor: #FFFFFF; focusWidth: 0; innerFocusWidth: 2");
		return boton;
	}

	public void addMenuListener(ActionListener listener) {
		btnHistoria.addActionListener(listener);
		btnEnfrentamiento.addActionListener(listener);
		btnPersonajes.addActionListener(listener);
		btnAyuda.addActionListener(listener);
	}

}
