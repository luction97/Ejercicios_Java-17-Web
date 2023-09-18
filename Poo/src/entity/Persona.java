package entity;

public class Persona {

	private int id;
	private static int cantPersonas;
	private String nombre;
	private String apellido;
	private Documento dni;
	private int edad;

	public Persona(String nombre, String apellido, Documento dni, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		cantPersonas++;
		this.id = cantPersonas;
	}



	public Persona() {

	}

	boolean mayorEdad() {
		return this.edad >= 18;
	}

	public static void cantidadPersonas() {
		System.out.println("Son " + cantPersonas + " personas.");
	}

	public String mostrarAtributos() {
		String mensaje = "nombre=" + nombre + ", apellido=" + apellido + ", " + dni.mostrarAtributos() + ", edad="
				+ edad + " y es " + (mayorEdad() ? "Mayor de edad" : "menor de edad") + " ID Persona= " + id;
		return mensaje;
	}


	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Documento getDNI() {
		return dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + dni + ", edad=" + edad + "]";
	}

}
