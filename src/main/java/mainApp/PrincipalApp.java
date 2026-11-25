package mainApp;

import basededatos.BDDConnection;

public class PrincipalApp {
	
	
	public static void main (String [] args) {
		try {
			BDDConnection.getInstance().pruebaConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
