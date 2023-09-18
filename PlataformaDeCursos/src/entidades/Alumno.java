package entidades;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

public class Alumno extends Empleado {
	private String fechaIngreso;
	private Map<Integer, String> listaCursos;

	public Alumno(String nombre, String apellido, Integer edad, LocalDate fechaNacimiento, Documento documento,
			Map<Integer, String> listaCursos) {
		super(nombre, apellido, edad, fechaNacimiento, documento);

		this.listaCursos = listaCursos;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Map<Integer, String> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(Map<Integer, String> listaCursos) {
		this.listaCursos = listaCursos;
	}

	



	@Override
	public String toString() {
		return "Alumno [fechaIngreso=" + fechaIngreso + ", listaCursos=" + listaCursos + ", getFechaIngreso()="
				+ getFechaIngreso() + ", getListaCursos()=" + getListaCursos() + ", getTipoDeEmpleado()="
				+ getTipoDeEmpleado() + ", getNombreApellido()=" + getNombreApellido() + ", mostrarTipoPersona()="
				+ mostrarTipoPersona() + "]";
	}

	@Override
	public String getTipoDeEmpleado() {
		return "Alumno";
	}

	@Override
	public String getNombreApellido() {
		return getNombre() + " " + getApellido();
	}

	@Override
	public void guardar() {
		System.out.println("Se guardó alumno");

	}

	@Override
	public void eliminar() {
		System.out.println("Se eliminó alumno");
	}

	@Override
	public void modificar() {
		System.out.println("Se modificó alumno");

	}

	@Override
	public String mostrarTipoPersona() {
		return "Alumno";
	}

	@Override
	public int compareTo(Empleado o) {
		
		return Integer.compare(this.getEdad(), o.getEdad());
	}

}
