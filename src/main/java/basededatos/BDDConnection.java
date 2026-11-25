package basededatos;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BDDConnection {
	private static BDDConnection instance;
	private Connection connection;
	
	private BDDConnection () throws Exception {
		connection = abrirConnection();
	}
	
	

	public Connection getConnection() {
		return connection;
	}



	public void setConnection(Connection connection) {
		this.connection = connection;
	}



	public static BDDConnection getInstance() throws Exception {
		if (instance == null) {
			instance = new BDDConnection();
		}
		return instance;
	}



	private Connection abrirConnection() throws Exception {
		Connection connection = null;
		Properties properties = new Properties();
		try {
			properties.load(new FileReader("src/main/resources/db.properties"));
			String driver = properties.getProperty("database.driver");
			String url = properties.getProperty("database.url");
			String usuario = properties.getProperty("database.user");
			String password = properties.getProperty("database.password");
			
			Class.forName(driver);
			connection = DriverManager.getConnection(url, usuario, password);
			connection.setAutoCommit(false);
			System.out.println("Conexión realizada");
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw e;
		}
		return connection;
	}
	
	public void pruebaConnection() {
		String stringSentencia = """
				SELECT * FROM LUCHADOR
				""";
		ResultSet resultSet = null;
		try (Statement statement = connection.createStatement(); ) {
			resultSet = statement.executeQuery(stringSentencia);
			while(resultSet.next()) {
				System.out.printf("%2d | %-10s | %3s años | %-15s | %3s cm | %3s kg | P:%3d V:%3d F:%3d%n",
	                    resultSet.getInt("Id_Luchador"),
	                    resultSet.getString("Nombre"),
	                    resultSet.getObject("Edad"),
	                    resultSet.getString("Nacionalidad"),
	                    resultSet.getObject("Estatura"),
	                    resultSet.getObject("Peso"),
	                    resultSet.getInt("Potencia"),
	                    resultSet.getInt("Velocidad"),
	                    resultSet.getInt("Fisico"));
				System.out.println("");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
