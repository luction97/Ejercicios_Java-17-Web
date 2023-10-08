package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static String baseDeDatos;
	static String jdbcUrl = "jdbc:mysql://localhost:3306/";
	static String usuario = "root";
	static String contrasenia = "";

	static Connection conexion = null;

	public Conexion(String baseDeDatos) {

		this.baseDeDatos = baseDeDatos;

	}

	public static Connection conectar() {

		try {
			// Obtener el driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			if (conexion == null || conexion.isClosed()) {

				conexion = DriverManager.getConnection(jdbcUrl + baseDeDatos, usuario, contrasenia);
				System.out.println("Conexión exitosa a la base de datos :" + jdbcUrl + baseDeDatos);
			}
		} catch (ClassNotFoundException e) {
			System.err.println(" Error con el driver " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Error de SQL al conectar: " + e.getMessage());
		}

		return conexion;
	}

	public void cerrarConexion() {

		try {
			if (conexion != null && !conexion.isClosed()) {

				conexion.close();
				System.out.println("Conexión cerrada.");
			}

		} catch (SQLException e) {
			System.err.println("Error al cerrar conexión SQL");
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void desconectar() {
		conexion = null;
	}

}
