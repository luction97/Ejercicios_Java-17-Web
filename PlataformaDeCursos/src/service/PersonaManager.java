package service;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import Interfaces.Persistencia;
import entidades.Alumno;
import entidades.Documento;
import entidades.Profesor;

public class PersonaManager {

	public static Profesor agregarProfesor(int indice) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el Nombre del Profesor [" + (indice) + "]: ");
		String nombre = teclado.next();
		System.out.print("Ingrese el Apellido del Profesor [" + (indice) + "]: ");
		String apellido = teclado.next();

		System.out.println("Ingreso de documento");
		Documento documento = agregarDocumento(indice);

		System.out.println("Ingrese la edad del Profesor [" + (indice) + "]:");
		int edad = teclado.nextInt();

		System.out.println("Ingrese la Fecha de Nacimiento del Profesor [" + (indice) + "]: ");
		LocalDate fechaNacimiento = obtenerFecha();
		System.out.println("Ingrese la Fecha de inicio del Cargo del Profesor [" + (indice) + "]: ");
		LocalDate fechaCargo = obtenerFecha();

		System.out.print("Ingrese el Sueldo del Profesor [" + (indice) + "]: ");
		Double sueldo = teclado.nextDouble();
		System.out.print("Ingrese la cantidad de cursos del Profesor [" + (indice) + "]: ");
		int cantidadCursos = teclado.nextInt();
		Map<Integer, String> cursos = agregarCursos(cantidadCursos);

		Profesor profesor = new Profesor(nombre, apellido, edad, fechaNacimiento, documento, fechaCargo, sueldo,
				cursos);
		return profesor;
	}

	public static Alumno agregarAlumno(int indice) throws Exception {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese el Nombre del Alumno [" + (indice + 1) + "]: ");
		String nombre = teclado.next();
		System.out.print("Ingrese el Apellido del Alumno [" + (indice + 1) + "]: ");
		String apellido = teclado.next();

		System.out.println("Ingrese la edad del Alumno [" + (indice) + "]:");
		int edad = teclado.nextInt();

		System.out.println("Ingreso de documento");
		Documento documento = agregarDocumento(indice);

		System.out.println("Ingrese la Fecha de Nacimiento del Alumno [" + (indice + 1) + "]: ");
		LocalDate fechaNacimiento = obtenerFecha();

		System.out.print("Ingrese la cantidad de cursos del Alumno [" + (indice + 1) + "]: ");
		int cantidadCursos = teclado.nextInt();
		Map<Integer, String> cursos = agregarCursos(cantidadCursos);

		Alumno alumno = new Alumno(nombre, apellido, edad, fechaNacimiento, documento, cursos);

		return alumno;

	}

	public static Documento agregarDocumento(int indice) {
		Scanner teclado = new Scanner(System.in);

		Set<String> tipoDocumentoValido = new HashSet<String>();

		tipoDocumentoValido.add("DNI");
		tipoDocumentoValido.add("PAS");
		tipoDocumentoValido.add("LE");
		tipoDocumentoValido.add("CI");

		String tipo = "";
		Integer numero = null;

		do {
			System.out.println("Ingrese el Tipo de Documento: ");
			tipo = teclado.next().toUpperCase();

			if (!tipoDocumentoValido.contains(tipo)) {
				System.out.println("Tipo de Documento inválido, intente nuevamente.");
			}
			System.out.println("Ingrese el Numero de Documento:");
			String numeroStr = teclado.next();

			try {
				numero = Integer.parseInt(numeroStr);

			} catch (NumberFormatException e) {
				System.out.println("Documento invalido, debe ingresar un número, intente nuevamente.");
				numero = null;
			}

		} while (!tipoDocumentoValido.contains(tipo) || numero == null || numero == 0);

		Documento documento = new Documento(tipo, numero);

		return documento;

	}

	public static LocalDate obtenerFecha() {
		Scanner teclado = new Scanner(System.in);

		LocalDate fechaFinal = null;

		while (fechaFinal == null) {
			System.out.print("Ingresa la fecha en formato dd/mm/aaaa ");
			String fecha = teclado.next();

			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				fechaFinal = LocalDate.parse(fecha, formatter);
			} catch (DateTimeParseException e) {
				System.err.println("Fecha incorreta. Formato esperado: dd/mm/aaaa");
			}
		}

		return fechaFinal;
	}

	public static Map<Integer, String> agregarCursos(int cantidad) {
		Scanner teclado = new Scanner(System.in);
		Integer idCurso = 0;

		Map<Integer, String> cursosConID = new HashMap<Integer, String>();
		for (int i = 0; i < cantidad; i++) {
			idCurso++;
			System.out.println("Ingrese el nombre del curso:" + (i + 1));
			String cursoNombre = teclado.next();
			cursosConID.put(idCurso, cursoNombre);
		}

		System.out.println("Se agregó en cursos: ");
		for (Map.Entry<Integer, String> iterator : cursosConID.entrySet()) {
			Integer clave = iterator.getKey();
			String curso = iterator.getValue();
			System.out.println("ID: " + clave + " CURSO: " + curso);
		}
		return cursosConID;

	}

}
