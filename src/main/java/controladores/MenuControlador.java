package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Usuario;
import vista.MenuPanel;
import vista.VentanaPrincipal;

public class MenuControlador implements ActionListener {

	private Usuario usuario;
	private MenuPanel menuPanel;
	private VentanaPrincipal ventana;

	public MenuControlador(VentanaPrincipal ventana) {
		this.ventana = ventana;
		this.usuario = ventana.getUsuario();
		this.menuPanel = ventana.getMenuPanel();

		this.menuPanel.getBtnAyuda().addActionListener(this);
		this.menuPanel.getBtnEnfrentamiento().addActionListener(this);
		this.menuPanel.getBtnHistoria().addActionListener(this);
		this.menuPanel.getBtnPersonajes().addActionListener(this);
		this.menuPanel.getLblUsuario().setText("JUGADOR: " + this.usuario.getNombre().toUpperCase());
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.menuPanel.getBtnAyuda()) {
			this.ventana.cambiarPantalla("AYUDA"); //Está sin hacer el panel
		}
		
		if(e.getSource()== this.menuPanel.getBtnEnfrentamiento()) {
			this.ventana.cambiarPantalla("SELECCION");  
			//Hay que crear clase partida y desde aquí le pasamos el modo(boolean) el usuario y los personajes que ya tiene desbloqueados
		}
		
		if(e.getSource()== this.menuPanel.getBtnHistoria()) {
			this.ventana.cambiarPantalla("SELECCION");
			//Hay que crear clase partida y desde aquí le pasamos el modo(boolean) el usuario y los personajes que ya tiene desbloqueados
		}
		
		if(e.getSource() == this.menuPanel.getBtnPersonajes()) {
			this.ventana.cambiarPantalla("DESCRIPCION");
		}

	}

}
