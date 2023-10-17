package Escritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Escritura {

	public void escribirArchivo(String redaccion) {
		// Instancio un objeto File de salida que recibe un string con el nombre.
		File archivoDeSalida = new File("archivo.txt");

		// Instancio un FileWriter que se encarga de escribir el archivo.
		try {
			FileWriter salida = new FileWriter(archivoDeSalida);
			String infoEscrita = redaccion;

			// Escribo el archivo con la información, iterando letra por letra.
			for (int i = 0; i < infoEscrita.length(); i++) {
				salida.write(infoEscrita.charAt(i));
			}

			// Cierro el stream
			salida.close();

			//El archivo es guardado en la carpeta principal del proyecto.
			System.out.println("El archivo fue escrito correctamente.");

		} catch (IOException e) {
			System.out.println("Error al escribir archivo");
			e.printStackTrace();
		}

	}

}
