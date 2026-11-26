package mainApp;

import com.formdev.flatlaf.FlatDarkLaf;

import basededatos.BDDConnection;
import controladores.LoginControlador;
import vista.VentanaPrincipal;

public class PrincipalApp {

	public static void main(String[] args) {
		FlatDarkLaf.setup();
		try {
			VentanaPrincipal frame = new VentanaPrincipal();
			frame.setVisible(true);
			LoginControlador loginControlador = new LoginControlador(frame);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
