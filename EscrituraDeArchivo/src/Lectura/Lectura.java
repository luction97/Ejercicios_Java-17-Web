package Lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {

	public void lectura() throws IOException {

		/*
		 * Necesita tener un archivo fuente.txt en el directorio ArchivoES\entrada
		 * 
		 */

		int unCaracter;
		// Instancio un objeto File de entrada
		File inputFile = new File("archivo.txt");

		// Instancio un FileReader que se encarga de leer el archivo, pasándoselo por
		// parámetro.
		try {

			FileReader input = new FileReader(inputFile);

			// Lee el archivo letra por letra
			while ((unCaracter = input.read()) != -1) {

			}
		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el archivo u ocurrió un error inesperado.");
		}

	}

}
