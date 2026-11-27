package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import basededatos.BDDConnection;
import modelo.Usuario;
import vista.LoginPanel;
import vista.VentanaPrincipal;

public class LoginControlador implements ActionListener {

	private BDDConnection conexion;
	private Usuario user;
	private LoginPanel loginPanel;
	private VentanaPrincipal ventana;

	public LoginControlador(VentanaPrincipal ventana) throws Exception {
		this.conexion = BDDConnection.getInstance();
		this.user = null;
		this.ventana = ventana;
		this.loginPanel = this.ventana.getLoginPanel();

		this.loginPanel.getBtnEntrar().addActionListener(this);
		this.loginPanel.getBtnRegistrarse().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.loginPanel.getBtnEntrar()) {

			String nombre = this.loginPanel.getTxtUsuario().getText();
			String contrasenia = new String(this.loginPanel.getPwdContrasena().getPassword());

			if (nombre.isBlank()) {
				this.loginPanel.getLblError().setVisible(true);
				this.loginPanel.getLblError().setText("El nombre es obligatorio");
				return;
			}
			if (contrasenia.isBlank()) {
				this.loginPanel.getLblError().setVisible(true);
				this.loginPanel.getLblError().setText("La contraseña es obligatoria");
				return;
			}

			this.user = conexion.devolverUsuario(nombre);

			if (this.user == null) {
				this.loginPanel.getLblError().setVisible(true);
				this.loginPanel.getLblError().setText("El usuario no existe");
				return;

			}

			if (!this.user.getContrasenia().equals(contrasenia)) {
				this.loginPanel.getLblError().setVisible(true);
				this.loginPanel.getLblError().setText("Contraseña incorrecta");
				return;

			}
			
			this.ventana.setUsuario(user);
			this.ventana.cambiarPantalla("MENU");

		}

		if (e.getSource() == this.loginPanel.getBtnRegistrarse()) {

			this.ventana.cambiarPantalla("REGISTRO");
		}

	}

}
