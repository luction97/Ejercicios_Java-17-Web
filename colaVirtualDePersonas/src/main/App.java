package main;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import entity.Documento;
import entity.Persona;
import utilities.PersonaComparatorMayorA55;

public class App {

	public static void main(String[] args) {

		Queue<Persona> filaDePersonas = new LinkedList<Persona>();

		filaDePersonas.add(new Persona(new Documento("DNI", 40553167), "Lucas", "Siano", 26));
		filaDePersonas.add(new Persona(new Documento("DNI", 40553168), "Maria", "Eutena", 22));
		filaDePersonas.add(new Persona(new Documento("DNI", 40553168), "Mario", "Flick", 59));
		filaDePersonas.add(new Persona(new Documento("DNI", 40553168), "Yo", "Robot", 55));

		// Declara una lista llamada "listaDePersonas" que contendrá objetos de tipo
		// Persona
		// Crea una nueva instancia de LinkedList y la inicializa con los elementos de
		// la colección "filaDePersonas"
		List<Persona> listaDePersonas = new LinkedList<>(filaDePersonas);

		// Ordena listaDePersonas utilizando el comparator personalizado
		// PersonaComparatorMayorA55
		Collections.sort(listaDePersonas, new PersonaComparatorMayorA55());

		System.out.println("Fila virtual de personas:");
		System.out.println("Ingresando primero las personas mayores a 55 años:");

		for (Persona persona : listaDePersonas) {
			System.out.println(persona);
		}
		System.out.println("......................................");

		System.out.println("Pasarán a atenderse:");

		int posicion = 1;
		for (Iterator iterator = listaDePersonas.iterator(); iterator.hasNext();) {

			Persona persona = (Persona) iterator.next();
			System.out.println("...................");
			System.out.println("Nro: " + posicion);
			System.out.println("...................");
			System.out.println("Nombre: " + persona.getNombre() + " ");
			System.out.print("Apellido: " + persona.getApellido());
			System.out.println("Edad: " + persona.getEdad());
			System.out.println("DOCUMENTO: " + persona.getDocumento());

			posicion++;

		}

	}

}
