package entity;

import java.util.Objects;

public class Persona {

	Documento documento;
	String nombre;
	String apellido;
	Integer edad;

	public Persona(Documento documento, String nombre, String apellido, Integer edad) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ "]";
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(documento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(documento, other.documento);
	}

}
