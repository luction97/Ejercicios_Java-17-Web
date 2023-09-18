package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import entidades.Alumno;
import entidades.Profesor;
import service.PersonaManager;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner teclado = new Scanner(System.in);
		HashSet<Alumno> alumnos = new HashSet<>();
		HashSet<Profesor> profesores = new HashSet<>();
		
		HashMap<String, Alumno> mapa = new HashMap<>();
		

		
		try {
			int i = 1;

			System.out.println("Ingreso de Datos de Personas Laboratorio01");
			System.out.print("\n");

			String rtaAgregar;
			do {

				System.out.println("¿Deseas ingresar un profesor(1) o un alumno(2)?");
				int tipoPersona = teclado.nextInt();

				if (tipoPersona == 1) {

					profesores.add(PersonaManager.agregarProfesor(i));

				} else if (tipoPersona == 2) {

					alumnos.add(PersonaManager.agregarAlumno(i));

				} else {
					System.out.println("Opción incorrecta, intente de nuevo.");
				}

				System.out.println("¿Desea agregar más personas?");
				rtaAgregar = teclado.next();
				i++;
			} while (rtaAgregar.equalsIgnoreCase("si"));

			teclado.close();

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-REGISTRO COMPLETADO-");
		System.out.println("A continuación, tomaremos asistencia por orden de edad de mayor a menor.");

		List<Alumno> alumnosList = new ArrayList<>(alumnos);
		List<Profesor> profesoresList = new ArrayList<>(profesores);

		Collections.sort(alumnosList);
		Collections.sort(profesoresList);

		System.out.println("Orden de menor a mayor por edad:");
		System.out.println("Alumnos ordenados por edad");
		for (Alumno i : alumnosList) {
			System.out.println(i);
		}
		System.out.println("Profesores ordenados por edad");
		for (Profesor i : profesoresList) {
			System.out.println(i);
		}

		System.out.println("Orden de mayor a menor por edad:");
		Collections.reverse(alumnosList);
		Collections.reverse(profesoresList);

		for (Alumno i : alumnosList) {
			System.out.println(i);
		}
		System.out.println("Profesores ordenados por edad");
		for (Profesor i : profesoresList) {
			System.out.println(i);
		}

	}

}
