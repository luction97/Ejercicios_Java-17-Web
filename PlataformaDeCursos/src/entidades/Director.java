package entidades;

import java.time.LocalDate;

public class Director extends Empleado {

	private LocalDate fechaCargo;
	private String carrera;
	private Double sueldo;

	public Director(String nombre, String apellido, Integer edad, LocalDate fechaNacimiento, Documento documento,
			LocalDate fechaCargo, String carrera, Double sueldo) {
		super(nombre, apellido, edad, fechaNacimiento, documento);
		this.fechaCargo = fechaCargo;
		this.carrera = carrera;
		this.sueldo = sueldo;
	}

	public LocalDate getFechaCargo() {
		return fechaCargo;
	}

	public void setFechaCargo(LocalDate fechaCargo) {
		this.fechaCargo = fechaCargo;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Director [fechaCargo=" + fechaCargo + ", carrera=" + carrera + ", sueldo=" + sueldo + "]";
	}

	@Override
	public String getTipoDeEmpleado() {
		return "Director";
	}

	@Override
	public String getNombreApellido() {
		return "nombre: " + getNombre() + " apellido: " + getApellido();
	}

	@Override
	public void guardar() {
		System.out.println("Director guardado");

	}

	@Override
	public void eliminar() {
		System.out.println("Se eliminó Director");

	}

	@Override
	public void modificar() {
		System.out.println("Se modifica Director");

	}

	@Override
	public String mostrarTipoPersona() {
		return "Director";
	}

	@Override
	public int compareTo(Empleado o) {
		
		return  Integer.compare(this.getEdad(), o.getEdad());
	}

}
