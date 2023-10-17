import Escritura.Escritura;
import Escritura.EscrituraMejorada;

public class App {

	public static void main(String[] args) {

		Escritura escritura = new Escritura();
		escritura.escribirArchivo("Escribiendo este archivo desde java..");

		EscrituraMejorada escrituraMejorada = new EscrituraMejorada();
		escrituraMejorada.escrituraMejorada("Escribiendo con BufferedWriter..");

	}

}
