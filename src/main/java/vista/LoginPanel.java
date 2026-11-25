package vista;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JLabel lblContrasena;
	private JPasswordField pwdContrasena;
	private JLabel lblError;
	private JButton btnEntrar;
	private JButton btnRegistrarse;
	private JLabel fondo;

	public LoginPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(EstilosVista.ANCHO_VENTANA, EstilosVista.ALTO_VENTANA));

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(EstilosVista.BLANCO);
		lblUsuario.setFont(EstilosVista.FUENTE_TEXTO_NEGRITA);
		lblUsuario.setBounds(550, 380, 400, 25);
		add(lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setFont(EstilosVista.FUENTE_TEXTO);
		txtUsuario.setBounds(550, 410, 400, 40);
		add(txtUsuario);

		lblContrasena = new JLabel("Contraseña:");
		lblContrasena.setForeground(EstilosVista.BLANCO);
		lblContrasena.setFont(EstilosVista.FUENTE_TEXTO_NEGRITA);
		lblContrasena.setBounds(550, 470, 400, 25);
		add(lblContrasena);

		pwdContrasena = new JPasswordField();
		pwdContrasena.setFont(EstilosVista.FUENTE_TEXTO);
		pwdContrasena.setBounds(550, 500, 400, 40);
		add(pwdContrasena);

		lblError = new JLabel("");
		lblError.setForeground(EstilosVista.ROJO_ERROR);
		lblError.setFont(EstilosVista.FUENTE_TEXTO);
		lblError.setBounds(550, 555, 400, 25);
		add(lblError);

		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(550, 600, 190, 45);
		EstilosVista.estilizarBoton(btnEntrar);
		add(btnEntrar);

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(760, 600, 190, 45);
		EstilosVista.estilizarBoton(btnRegistrarse);
		add(btnRegistrarse);

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

	public JLabel getLblError() {
		return lblError;
	}

	public JButton getBtnEntrar() {
		return btnEntrar;
	}

	public JButton getBtnRegistrarse() {
		return btnRegistrarse;
	}
}
