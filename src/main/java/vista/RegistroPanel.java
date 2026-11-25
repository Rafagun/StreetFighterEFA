package vista;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistroPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JLabel lblContrasena;
	private JPasswordField pwdContrasena;
	private JLabel lblRepetirContrasena;
	private JPasswordField pwdRepetirContrasena;
	private JLabel lblError;
	private JButton btnCrearCuenta;
	private JButton btnVolver;
	private JLabel fondo;

	public RegistroPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(EstilosVista.ANCHO_VENTANA, EstilosVista.ALTO_VENTANA));

		lblUsuario = new JLabel("Nombre de usuario:");
		lblUsuario.setForeground(EstilosVista.BLANCO);
		lblUsuario.setFont(EstilosVista.FUENTE_TEXTO_NEGRITA);
		lblUsuario.setBounds(550, 350, 400, 25);
		add(lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setFont(EstilosVista.FUENTE_TEXTO);
		txtUsuario.setBounds(550, 378, 400, 40);
		add(txtUsuario);

		lblContrasena = new JLabel("Contraseña:");
		lblContrasena.setForeground(EstilosVista.BLANCO);
		lblContrasena.setFont(EstilosVista.FUENTE_TEXTO_NEGRITA);
		lblContrasena.setBounds(550, 428, 400, 25);
		add(lblContrasena);

		pwdContrasena = new JPasswordField();
		pwdContrasena.setFont(EstilosVista.FUENTE_TEXTO);
		pwdContrasena.setBounds(550, 456, 400, 40);
		add(pwdContrasena);

		lblRepetirContrasena = new JLabel("Repetir contraseña:");
		lblRepetirContrasena.setForeground(EstilosVista.BLANCO);
		lblRepetirContrasena.setFont(EstilosVista.FUENTE_TEXTO_NEGRITA);
		lblRepetirContrasena.setBounds(550, 506, 400, 25);
		add(lblRepetirContrasena);

		pwdRepetirContrasena = new JPasswordField();
		pwdRepetirContrasena.setFont(EstilosVista.FUENTE_TEXTO);
		pwdRepetirContrasena.setBounds(550, 534, 400, 40);
		add(pwdRepetirContrasena);

		lblError = new JLabel("");
		lblError.setForeground(EstilosVista.ROJO_ERROR);
		lblError.setFont(EstilosVista.FUENTE_TEXTO);
		lblError.setBounds(550, 584, 400, 25);
		add(lblError);

		btnCrearCuenta = new JButton("Crear cuenta");
		btnCrearCuenta.setBounds(550, 625, 190, 45);
		EstilosVista.estilizarBoton(btnCrearCuenta);
		add(btnCrearCuenta);

		btnVolver = new JButton("Iniciar sesión");
		btnVolver.setBounds(760, 625, 190, 45);
		EstilosVista.estilizarBoton(btnVolver);
		add(btnVolver);

		fondo = new JLabel(
				new ImageIcon(getClass().getResource("/img/imagenesPaneles/fondo_login_registro_1500x800.png")));
		fondo.setBounds(0, 0, EstilosVista.ANCHO_VENTANA, EstilosVista.ALTO_VENTANA);
		add(fondo);
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public JPasswordField getPwdContrasena() {
		return pwdContrasena;
	}

	public JPasswordField getPwdRepetirContrasena() {
		return pwdRepetirContrasena;
	}

	public JLabel getLblError() {
		return lblError;
	}

	public JButton getBtnCrearCuenta() {
		return btnCrearCuenta;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}
}