package entidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Documento {

	private String contenido;

	public Documento(String contenido) {
		this.contenido = contenido;
	}

	public void imprimirArchivo(String ruta) {
		String rutaArchivo = ruta;

		try (BufferedWriter escribe = new BufferedWriter(new FileWriter(rutaArchivo))) {
			escribe.write(contenido);
			System.out.println("Imprimiendo documento en " + rutaArchivo + " ...");
			System.out.println(contenido);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}
