package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entidades.Director;
import conexiones.Conexion;

public class DirectorDAO {

	public void crear(Director director) {

		try {
			Connection conectar = Conexion.conectar();

			String sql = "Insert into usuarios(nombre, email) " + "VALUES(?,?);";

			PreparedStatement stmt = conectar.prepareStatement(sql);
			stmt.setString(1, director.getNombre());
			stmt.setString(2, director.getEmail());
			stmt.executeUpdate();
			stmt.close();
			System.out.println("Usuario: " + director.getNombre() + " creado exitosamente!");
		} catch (Exception e) {

			System.out.println("Error al crear director");

		}

	}

	public static Director getDirector(int id) {
		Director director = new Director();
		try {

			Connection conectar = Conexion.conectar();

			String sql = "SELECT * FROM usuarios where id = ?;";

			PreparedStatement ps = conectar.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				String nombre = rs.getString("nombre");
				String email = rs.getString("email");

				director.setNombre(nombre);
				director.setEmail(email);

			}

			conectar.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return director;

	}

	public void eliminar(int id) {

		try {
			Connection conectar = Conexion.conectar();

			String sql = "delete from usuarios where id = ?;";

			PreparedStatement stmt = conectar.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			stmt.close();
			System.out.println("Usuario: " + id + " ELIMINADO");
		} catch (Exception e) {

			System.out.println("Error al eliminar director con id" + id);

		}

	}

}
