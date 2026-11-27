package basededatos;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import modelo.Luchador;
import modelo.Usuario;

public class BDDConnection {
	private static BDDConnection instance;
	private Connection connection;

	private BDDConnection() throws Exception {
		connection = abrirConnection();
		luchadores = obtenerLuchadores();
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
	
	public ArrayList<Luchador> obtenerLuchadores() {
		ArrayList<Luchador> luchadores = new ArrayList<Luchador>();
		String stringSentencia = """
				SELECT * FROM LUCHADOR
				""";
		ResultSet resultSet = null;
		try (Statement statement = connection.createStatement(); ) {
			resultSet = statement.executeQuery(stringSentencia);
			while(resultSet.next()) {
				Luchador luchador = new Luchador (
	                    resultSet.getInt("Id_Luchador"),
	                    resultSet.getString("Nombre"),
	                    resultSet.getString("Nacionalidad"),
	                    resultSet.getInt("Edad"),
	                    resultSet.getInt("Estatura"),
	                    resultSet.getInt("Peso"),
	                    resultSet.getInt("Potencia"),
	                    resultSet.getInt("Velocidad"),
	                    resultSet.getInt("Fisico"),
	                    resultSet.getString("Descripcion"));
				luchadores.add(luchador);

	public Usuario devolverUsuario(String nombre) {

		String sentencia = "SELECT * " + "	FROM USUARIO " + "WHERE NOMBRE = ? ";

		try (PreparedStatement statement = connection.prepareStatement(sentencia)) {

			statement.setString(1, nombre);

			try (ResultSet resultado = statement.executeQuery()) {

				if (resultado.next()) {
					Usuario usuario = new Usuario();
					usuario.setNombre(resultado.getString("Nombre"));
					usuario.setContrasenia(resultado.getString("Contrasenia"));
					usuario.setVictorias(resultado.getInt("Total_Victorias"));
					usuario.setDerrotas(resultado.getInt("Total_Derrotas"));
					return usuario;
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return luchadores;
		
		

			e.printStackTrace();
		}

		return null;
	}

	public void insertarUsuario(Usuario usuario) {

		String sentencia = "INSERT INTO USUARIO ( Nombre, Contrasenia, Total_Victorias, Total_Derrotas)"
				+ "VALUES(?,?,?,?)";
		try (PreparedStatement statement = connection.prepareStatement(sentencia)) {

			statement.setString(1, usuario.getNombre());
			statement.setString(2, usuario.getContrasenia());
			statement.setInt(3, usuario.getVictorias());
			statement.setInt(4, usuario.getDerrotas());
			int filas = statement.executeUpdate();

			System.out.println("Fila insertada :" + filas);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
