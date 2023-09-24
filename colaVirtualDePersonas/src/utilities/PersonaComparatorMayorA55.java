package utilities;

import java.util.Comparator;

import entity.Persona;

public class PersonaComparatorMayorA55 implements Comparator<Persona> {

	public PersonaComparatorMayorA55() {

	}

	@Override
	public int compare(Persona p1, Persona p2) {

		if (p1.getEdad() >= 55 && p2.getEdad() <= 55) {
			return -1; // P1 (mayor de 55) va antes que P2 (menor o igual a 55)
		} else if (p1.getEdad() <= 55 && p2.getEdad() > 55) {
			return 1; // P2 (mayor de 55) va después que P1 (menor o igual a 55)
		} else {
			return 0; // No cambian de posición (ambos son mayores o menores de 55)
		}
	}

}
