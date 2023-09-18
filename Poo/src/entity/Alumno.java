package entity;

public class Alumno extends Persona {

	private int id;
	private static int cantidadAlumnos;
	private String curso;

	public Alumno(String nombre, String apellido, Documento dni, int edad, String curso) {
		super(nombre, apellido, dni, edad);
		cantidadAlumnos++;
		this.curso = curso;
		this.id = cantidadAlumnos;
	}

	
	
	
	public int getId() {
		return id;
	}

	public static int getCantidadAlumnos() {
		return cantidadAlumnos;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString() + " curso= " + curso + " ID Alumno= " + id;
	}

}
