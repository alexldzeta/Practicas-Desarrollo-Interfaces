package PRACTICA6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	static final String URL = "jdbc:postgresql://localhost:5432/Jardineria";
	static final String USER = "postgres";
	static final String PASS = "pepinillo34";
	
	public static Connection nuevaConexion() throws SQLException, ClassNotFoundException {
		
		Class.forName("org.postgresql.Driver");
		Connection conexion = DriverManager.getConnection(URL, USER, PASS);
		
		if (conexion != null) {
			
			System.out.println("Conexión establecida...");
			return conexion;
			
		}
		
		return null;
		
	}
	
}
