package service;

import java.util.Scanner;

import entity.Documento;
import entity.Persona;

public class PersonaService {

	Persona[] personas;
	int cantPersonas;

	public void crearPersonas() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingreso de Datos de Personas");
		System.out.print("\n");
		System.out.print("Ingrese la cantidad de Personas que cargara: ");
		cantPersonas = teclado.nextInt();

		personas = new Persona[cantPersonas];

		for (int i = 0; i < personas.length; i++) {

			System.out.println("Ingrese nombre de la persona");
			String nombre = teclado.next();
			System.out.println("Ingrese apellido de la persona");
			String apellido = teclado.next();
			System.out.println("Ingrese edad de la persona");
			int edad = teclado.nextInt();

			System.out.println("Ingrese tipo de documento");
			String tipoDocu = teclado.next();
			System.out.println("Ingrese número de documento");
			int numDocu = teclado.nextInt();

			// String nombre, String apellido, Documento dni, int edad
			Persona persona = new Persona(nombre, apellido, new Documento(tipoDocu, numDocu), edad);
			personas[i] = persona;

			System.out.print("\n");
		}
		// Muestra la cantidad total de personas creadas y sus datos
		Persona.cantidadPersonas();
		System.out.print("\n");
		System.out.println("--Datos de las Personas cargadas--");
		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i].mostrarAtributos());
		}

		teclado.close();
	}

}
