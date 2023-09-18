package entity;

public class Customer {
	private static Integer id;
	private String nombre;
	private String apellido;
	private Document documento;

	public Customer(String nombre, String apellido, Document documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.id = ++id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Document getDocumento() {
		return documento;
	}

	public void setDocumento(Document documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "Customer [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + "]";
	}

}
