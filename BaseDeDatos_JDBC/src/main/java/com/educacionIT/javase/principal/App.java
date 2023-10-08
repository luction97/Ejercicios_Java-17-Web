package com.educacionIT.javase.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.educacionIT.javase.entidades.Administrativo;
import com.educacionIT.javase.entidades.Documento;
import com.educacionIT.javase.entidades.Empleado;
import com.educacionIT.javase.enumerados.TiposDocumento;
import com.educacionIT.javase.interfaces.UtilidadesFecha;

/**
 * Hello world!
 *
 */
public class App {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingreso de Datos de Administrador");
		System.out.print("\n");

		String nombre;
		String apellido;
		TiposDocumento tipo;
		Integer numero;
		Date fechaNacimiento;
		Date fechaCargo;
		Float sueldo;

		// objeto auxiliar
		Empleado empleado = null;

		System.out.print("Ingrese el Nombre de la Persona : ");
		nombre = teclado.next();
		System.out.print("Ingrese el Apellido de la Persona : ");
		apellido = teclado.next();

		while (true) {
			System.out.print("Ingrese el Tipo de Documento de la Persona : ");

			try {
				tipo = TiposDocumento.valueOf(teclado.next().toUpperCase());
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.print("Ingrese el Numero de Documento de la Persona : ");
		numero = teclado.nextInt();
		System.out.println("Ingrese la Fecha de Nacimiento de la Persona : ");
		fechaNacimiento = obtenerFecha();

		System.out.println("Ingrese la Fecha de inicio del Cargo de la Persona : ");
		fechaCargo = obtenerFecha();

		System.out.print("Ingrese el Sueldo de la Persona : ");
		sueldo = teclado.nextFloat();

		empleado = new Administrativo(nombre, apellido, new Documento(tipo, numero), fechaNacimiento, fechaCargo,
				sueldo);

		insertar(empleado);

		teclado.close();
	}

	/*
	 * Metodo para obtener la fecha
	 */
	private static Date obtenerFecha() {

		String fechaUsuario = "";
		Date fecha = null;
		while (true) {
			try {
				System.out.print("Formato Fecha[dd/mm/aaaa]: ");
				fechaUsuario = teclado.next();
				// el metodo parse recibe un string y retorna un objeto de tipo DATE
				fecha = UtilidadesFecha.getStringAFecha(fechaUsuario);
				break;
			} catch (ParseException e) {
				System.err.println("debe ingresar un dato valido: " + e.getMessage());
			}
		}

		return fecha;
	}

	private static Connection conectarBaseDeDatos() throws SQLException {
		Connection conexion = null;
		try {

			String driver = "org.mariadb.jdbc.Driver";
			String url = "jdbc:mariadb://localhost:3306/sistemaEducacionIT";
			String usuario = "root";
			String clave = "";

			// REGISTRO EL DRIVER
			Class.forName(driver);

			// CREO LA CONEXION
			conexion = DriverManager.getConnection(url, usuario, clave);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conexion;
	}

	private static void insertar(Empleado empleado) {

		try (Connection conexion = conectarBaseDeDatos()) {

			String sql = "INSERT INTO Empleados (TipoDocumento,NumeroDocumento,Nombre,Apellido,FechaNacimiento,FechaCargo,sueldo,Tipo) "
					+ "VALUES  ('" + empleado.getDocumento().getTipo() + "'," + empleado.getDocumento().getNumero()
					+ ",'" + empleado.getNombre() + "','" + empleado.getApellido() + "','"
					+ UtilidadesFecha.getFechaAStringsSQL(empleado.getFechaNacimiento()) + "','"
					+ UtilidadesFecha.getFechaAStringsSQL(empleado.getFechaCargo()) + "'," + empleado.getSueldo()
					+ ",4);";

			// CREO OBJETO STATEMENT
			Statement declaracionSQL = conexion.createStatement();

			// EJECUTO EL SQL
			declaracionSQL.execute(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
