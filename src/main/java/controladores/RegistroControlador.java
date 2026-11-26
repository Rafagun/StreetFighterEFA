package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import basededatos.BDDConnection;
import modelo.Usuario;
import vista.RegistroPanel;
import vista.VentanaPrincipal;

public class RegistroControlador implements ActionListener {
	private BDDConnection conexion;
	private Usuario user;
	private RegistroPanel registroPanel;
	private VentanaPrincipal ventana;

	public RegistroControlador(VentanaPrincipal ventana) throws Exception {
		this.conexion = BDDConnection.getInstance();
		this.user = null;
		this.ventana = ventana;
		this.registroPanel = this.ventana.getRegistroPanel();

		this.registroPanel.getBtnCrearCuenta().addActionListener(this);
		this.registroPanel.getBtnVolver().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.registroPanel.getBtnVolver()) {

			this.ventana.cambiarPantalla("INICIO");
		}

		if (e.getSource() == this.registroPanel.getBtnCrearCuenta()) {

			String nombre = this.registroPanel.getTxtUsuario().getText();
			String contrasenia = new String(this.registroPanel.getPwdContrasena().getPassword());
			String contraseniaRepetida = new String(this.registroPanel.getPwdRepetirContrasena().getPassword());

			if (nombre.isBlank()) {
				this.registroPanel.getLblError().setVisible(true);
				this.registroPanel.getLblError().setText("El nombre es obligatorio");
				return;
			}
			if (contrasenia.isBlank()) {
				this.registroPanel.getLblError().setVisible(true);
				this.registroPanel.getLblError().setText("La contraseña es obligatoria");
				return;
			}
			if (contraseniaRepetida.isBlank()) {
				this.registroPanel.getLblError().setVisible(true);
				this.registroPanel.getLblError().setText("La contraseña es obligatoria");
				return;
			}

			if (!contrasenia.equals(contraseniaRepetida)) {
				this.registroPanel.getLblError().setVisible(true);
				this.registroPanel.getLblError().setText("Las contraseñas no coinciden");
				return;
			}

			this.user = conexion.devolverUsuario(nombre);

			if (this.user != null) {
				this.registroPanel.getLblError().setVisible(true);
				this.registroPanel.getLblError().setText("El usuario introducido ya existe");
			} else {
				Usuario usuario = new Usuario();
				usuario.setNombre(nombre);
				usuario.setContrasenia(contrasenia);
				usuario.setVictorias(0);
				usuario.setDerrotas(0);
				// cuando esté completo lo de añadir luchadores los añado aquí

				this.conexion.insertarUsuario(usuario);

				this.ventana.cambiarPantalla("MENU");

			}

		}

	}
}
