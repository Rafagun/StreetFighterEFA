package mainApp;

import com.formdev.flatlaf.FlatDarkLaf;

import basededatos.BDDConnection;
import vista.VentanaPrincipal;

public class PrincipalApp {

	public static void main(String[] args) {
		FlatDarkLaf.setup();
		try {
			VentanaPrincipal frame = new VentanaPrincipal();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
