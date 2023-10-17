package Lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaMejorada {

	public static void LecturaMejorada() {

		// Instancio objeto File de entrada
		File inputFile = new File("ejemploLecturaMejorada.txt");

		try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));

			String lineaLeida = "";

			while (true) {

				lineaLeida = reader.readLine();

				if (lineaLeida != null) {
					// Imprime en pantalla la lectura
					System.out.println(lineaLeida);

				} else {
					break;
				}
				reader.close();
			}
		} catch (Exception e) {
			System.out.println("Error al leer el archivo");
			e.getMessage();
		}
	}

}
