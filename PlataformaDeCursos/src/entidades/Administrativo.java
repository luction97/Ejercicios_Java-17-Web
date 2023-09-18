package entidades;

import java.time.LocalDate;

public class Administrativo extends Empleado {
	private LocalDate fechaCargo;
	private Double sueldo;

	public Administrativo(String nombre, String apellido, Integer edad, LocalDate fechaNacimiento, Documento documento,
			LocalDate fechaCargo, Double sueldo) {
		super(nombre, apellido, edad, fechaNacimiento, documento);
		this.fechaCargo = fechaCargo;
		this.sueldo = sueldo;
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

	@Override
	public String toString() {
		return "Administrativo [fechaCargo=" + fechaCargo + ", sueldo=" + sueldo + "]";
	}

	@Override
	public String getTipoDeEmpleado() {
		return "Administrativo";
	}

	@Override
	public String getNombreApellido() {
		return "nombre: " + getNombre() + " apellido: " + getApellido();
	}

	@Override
	public void guardar() {
		System.out.println("Se guardó administrativo");

	}

	@Override
	public void eliminar() {
		System.out.println("Se eliminó administrativo");

	}

	@Override
	public void modificar() {
		System.out.println("Se modificó administrativo");

	}

	@Override
	public String mostrarTipoPersona() {
		return "Administrativo";
	}

	@Override
	public int compareTo(Empleado o) {

		return Integer.compare(this.getEdad(), o.getEdad());
	}

}
