package entity;

public class Profesor extends Persona{
	
	private double pagoTotal;
	
	public Profesor(String nombre, String apellido, Documento dni, int edad, double pagoTotal) {
		super(nombre, apellido, dni, edad);
		this.pagoTotal = pagoTotal;
	}

}
