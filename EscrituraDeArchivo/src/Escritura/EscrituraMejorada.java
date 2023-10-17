package Escritura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class EscrituraMejorada {

	public static void escrituraMejorada(String texto) {

		// Instancio un objeto File de salida
		File outputFile = new File("ejemplo.txt");

		try {
			// Construyo un BufferedWriter
			BufferedWriter escritura = new BufferedWriter(new FileWriter(outputFile));
			escritura.write(texto, 0, texto.length());
			escritura.close();

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
