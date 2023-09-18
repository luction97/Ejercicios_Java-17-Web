package Clase17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe primer el texto");
		String texto = teclado.nextLine();
		System.out.println("Escribí el segundo texto");
		String texto2 = teclado.nextLine();
		System.out.println("Escribí el tercer texto");
		String texto3 = teclado.nextLine();

		// Creo el objeto file que armacena el archivo.txt
		File file = new File("archivo.txt");

		try {
			// Escribe el texto en el archivo pero lo hace letra por letra
			FileWriter fw = new FileWriter(file, true);

			// Con charAt va insertando letra por letra en el archivo
			for (int i = 0; i < texto.length(); i++) {
				fw.write(texto.charAt(i));
			}
			// Permite escribir el archivo agregando salto de linea automático
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(texto, 0, texto.length()); // Recorre cada texto ingresado
			bw.newLine(); // Agrega nueva linea
			bw.write(texto2, 0, texto2.length());
			bw.newLine(); // nueva linea
			bw.write(texto3, 0, texto3.length());
			bw.newLine(); // Nueva linea

			// Cierro la escritura
			fw.close();
			bw.close();

			System.out.println("Escribiendo...");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
