package mainApp;

import com.formdev.flatlaf.FlatDarkLaf;

import basededatos.BDDConnection;
import controladores.LoginControlador;
import controladores.RegistroControlador;
import vista.VentanaPrincipal;

public class PrincipalApp {

	public static void main(String[] args) {
		FlatDarkLaf.setup();
		try {
			VentanaPrincipal frame = new VentanaPrincipal();
			frame.setVisible(true);
			LoginControlador loginControlador = new LoginControlador(frame);
			RegistroControlador registroControlador = new RegistroControlador(frame);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
