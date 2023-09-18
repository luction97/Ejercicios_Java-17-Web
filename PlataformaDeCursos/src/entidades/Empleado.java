package entidades;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Empleado extends Persona implements Comparable<Empleado> {
	private String nombre;
	private String apellido;
	private Integer edad;
	private LocalDate fechaNacimiento;
	private Documento documento;

	public Empleado(String nombre, String apellido, Integer edad, LocalDate fechaNacimiento, Documento documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.documento = documento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public abstract String getTipoDeEmpleado();

	public abstract String getNombreApellido();

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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Documento getDocumento() {
		return documento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, documento, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(documento, other.documento)
				&& Objects.equals(edad, other.edad) && Objects.equals(nombre, other.nombre);
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

}
