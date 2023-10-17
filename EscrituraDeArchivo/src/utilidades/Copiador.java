package utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copiador {

	public void copiar() throws FileNotFoundException {
		// Instancio un objeto de entrada y otro de salida.
		File inputFile = new File("archivoES" + File.separator + "entrada" + File.separator + "fuente.txt");
		File outputFile = new File("archivoES" + File.separator + "salida" + File.separator + "destino.txt");

		// Instancio un FileReader y un FileWriter que se encargarán de leer y escribir
		// archivos respectivamente.
		try {
			// Lee el archivo in
			FileReader in = new FileReader(inputFile);
			int unCaracter;

			// Guarda la información de el archivo in en el out
			try {
				FileWriter out = new FileWriter(outputFile);
				while ((unCaracter = in.read()) != -1) {
					out.write(unCaracter);
				}
				out.close();
				in.close();
			} catch (IOException e) {
				System.out.println("Error: el archivo no se pudo copiar.");
				e.printStackTrace();
			}

			System.out.println("\n\tEl archivo se está copiando..");
		} catch (FileNotFoundException e) {
			System.out.println("Error: archivo no encontrado.");
			e.printStackTrace();
		}

	}

}
