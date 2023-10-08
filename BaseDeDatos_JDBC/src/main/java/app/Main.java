package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Entidades.Director;
import conexiones.Conexion;
import dao.DirectorDAO;

public class Main {
	public static void main(String[] args) {

		Conexion conexion = new Conexion("databaselaboratorio01");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese su nombre de usuario: ");
			String nombre = reader.readLine();
			System.out.println("Ingrese su correo: ");
			String correo = reader.readLine();

		} catch (Exception e) {
			System.out.println("Error: el dato ingresado es incorrecto");
		}

		DirectorDAO directorDAO = new DirectorDAO();
		Director directorEntidad = new Director("Lucas", "lucassound@live.com");
		directorDAO.crear(directorEntidad);
		conexion.desconectar();

	}

}
