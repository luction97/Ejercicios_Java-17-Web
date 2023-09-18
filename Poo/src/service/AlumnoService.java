package service;

import java.util.Scanner;

import entity.Alumno;
import entity.Documento;
import entity.Persona;

public class AlumnoService {

	Alumno[] alumnos;
	int cantAlumnos;

	public void crearAlumno() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingreso de Datos de Alumnos");
		System.out.print("\n");
		System.out.print("Ingrese la cantidad de alumnos que cargara: ");
		cantAlumnos = teclado.nextInt();

		alumnos = new Alumno[cantAlumnos];

		for (int i = 0; i < alumnos.length; i++) {

			System.out.println("Ingrese nombre del alumno");
			String nombre = teclado.next();
			System.out.println("Ingrese apellido del alumno");
			String apellido = teclado.next();
			System.out.println("Ingrese edad del alumno");
			int edad = teclado.nextInt();

			System.out.println("Ingrese tipo de documento");
			String tipoDocu = teclado.next();
			System.out.println("Ingrese número de documento");
			int numDocu = teclado.nextInt();
			System.out.println("Ingrese el curso al que pertenece el Alumno");
			String curso = teclado.next();
			// String nombre, String apellido, Documento dni, int edad
			Alumno alumno = new Alumno(nombre, apellido, new Documento(tipoDocu, numDocu), edad, curso);
			alumnos[i] = alumno;

			System.out.print("\n");
		}
		
		
		// Muestra la cantidad total de alumnos creados y sus datos
		System.out.println("Cantidad de alumnos cargados: "+Alumno.getCantidadAlumnos());
		System.out.print("\n");
		System.out.println("--Datos de las Personas cargadas--");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i].toString());
		}

		teclado.close();

	}
	
	
	

}
