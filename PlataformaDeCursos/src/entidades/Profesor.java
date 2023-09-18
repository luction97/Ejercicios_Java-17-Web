package entidades;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

public class Profesor extends Empleado {
	private LocalDate fechaCargo;
	private Double sueldo;
	private Map<Integer, String> listaCursos;

	public Profesor(String nombre, String apellido, Integer edad, LocalDate fechaNacimiento, Documento documento,
			LocalDate fechaCargo, Double sueldo, Map<Integer, String> listaCursos) {
		super(nombre, apellido, edad, fechaNacimiento, documento);
		this.fechaCargo = fechaCargo;
		this.sueldo = sueldo;
		this.listaCursos = listaCursos;
	}

	public LocalDate getFechaCargo() {
		return fechaCargo;
	}

	public void setFechaCargo(LocalDate fechaCargo) {
		this.fechaCargo = fechaCargo;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Map<Integer, String> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(Map<Integer, String> listaCursos) {
		this.listaCursos = listaCursos;
	}

	@Override
	public String toString() {
		return "Profesor [fechaCargo=" + fechaCargo + ", sueldo=" + sueldo + ", listaCursos=" + listaCursos
				+ ", getFechaCargo()=" + getFechaCargo() + ", getSueldo()=" + getSueldo() + ", getListaCursos()="
				+ getListaCursos() + ", getTipoDeEmpleado()=" + getTipoDeEmpleado() + ", getNombreApellido()="
				+ getNombreApellido() + ", mostrarTipoPersona()=" + mostrarTipoPersona() + "]";
	}

	@Override
	public String getTipoDeEmpleado() {
		return "Profesor";
	}

	@Override
	public String getNombreApellido() {
		return "nombre: " + getNombre() + " apellido: " + getApellido();
	}

	@Override
	public void guardar() {
		System.out.println("Se guardó Profesor");

	}

	@Override
	public void eliminar() {
		System.out.println("Se eliminó Profesor");

	}

	@Override
	public void modificar() {
		System.out.println("Se modificó Profesor");

	}

	@Override
	public String mostrarTipoPersona() {
		return "Profesor";
	}

	@Override
	public int compareTo(Empleado empleado) {

		return Integer.compare(this.getEdad(), empleado.getEdad());
	}

}
