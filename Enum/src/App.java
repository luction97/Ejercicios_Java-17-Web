import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		/*
		 * Cada elemento del enum es un objeto. Quiere decir que cada una de esas
		 * constantes que añadimos al enumerado al final se están instanciando de forma
		 * implícita dentro de la clase enum. Si le colocamos los paréntesis del
		 * constructor por defecto no presentará error.
		 * 
		 * 
		 * Cada elemento del enum es un objeto. Quiere decir que cada una de esas
		 * constantes que añadimos al enumerado al final se están instanciando de forma
		 * implícita dentro de la clase enum. Si le colocamos los paréntesis del
		 * constructor por defecto no presentará error.
		 */
		
		
		

		Colores color = Colores.valueOf("ROJO");
		System.out.println(color.name());
		System.out.println(color.toString());
		System.out.println(color.ordinal());
		System.out.println(Arrays.toString(Colores.values()));

	}

}
