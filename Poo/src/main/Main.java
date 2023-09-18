package main;

import java.util.Scanner;
import entity.Persona;
import service.AlumnoService;
import service.PersonaService;

public class Main {

	public static void main(String[] args) {
			
//		PersonaService personaService = new PersonaService();
//		personaService.crearPersonas();
		
		AlumnoService alumnoService = new AlumnoService();
		alumnoService.crearAlumno();
		

	}

}
