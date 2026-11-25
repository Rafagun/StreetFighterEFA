package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
		setPreferredSize(new Dimension(1500, 800));

		Font fuenteEtiqueta = new Font("Tahoma", Font.BOLD, 18);
		Font fuenteCampo = new Font("Tahoma", Font.PLAIN, 18);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(fuenteEtiqueta);
		lblUsuario.setBounds(550, 380, 400, 25);
		add(lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setFont(fuenteCampo);
		txtUsuario.setBounds(550, 410, 400, 40);
		add(txtUsuario);

		lblContrasena = new JLabel("Contraseña:");
		lblContrasena.setForeground(Color.WHITE);
		lblContrasena.setFont(fuenteEtiqueta);
		lblContrasena.setBounds(550, 470, 400, 25);
		add(lblContrasena);

		pwdContrasena = new JPasswordField();
		pwdContrasena.setFont(fuenteCampo);
		pwdContrasena.setBounds(550, 500, 400, 40);
		add(pwdContrasena);

		lblError = new JLabel("");
		lblError.setForeground(Color.RED);
		lblError.setFont(fuenteCampo);
		lblError.setBounds(550, 555, 400, 25);
		add(lblError);

		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(550, 600, 190, 45);
		estilizarBoton(btnEntrar);
		add(btnEntrar);

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(760, 600, 190, 45);
		estilizarBoton(btnRegistrarse);
		add(btnRegistrarse);

		fondo = new JLabel(
				new ImageIcon(getClass().getResource("/img/imagenesPaneles/fondo_login_registro_1500x800.png")));
		fondo.setBounds(0, 0, 1500, 800);
		add(fondo);

	}

	private void estilizarBoton(JButton boton) {
		boton.setFont(new Font("Tahoma", Font.BOLD, 18));
		boton.setBackground(new Color(255, 140, 0));
		boton.setForeground(Color.BLACK);
		boton.setFocusPainted(false);
		boton.putClientProperty("JButton.buttonType", "roundRect");
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