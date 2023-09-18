import java.util.Scanner;

public class ClaseOcho {

	public static void main(String[] args) {

		try {

			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese numero");
			int numero = teclado.nextInt();

			if (numero == 1) {

				throw new Exception("Error: No acepto el 1");

			} else if(numero == 2) {
				System.out.println("Error: No acepto el 2");
			}
			

		} catch (Exception e) {
			System.out.println("todo fallo");
			System.out.println(e.getMessage());

		}

	}

}
