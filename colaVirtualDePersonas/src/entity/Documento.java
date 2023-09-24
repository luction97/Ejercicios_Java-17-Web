package entity;

public class Documento {

	String tipo;
	Integer nro;

	public Documento(String tipo, Integer nro) {
		this.tipo = tipo;
		this.nro = nro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getNro() {
		return nro;
	}

	public void setNro(Integer nro) {
		this.nro = nro;
	}

	@Override
	public String toString() {
		return "Documento [tipo=" + tipo + ", nro=" + nro + "]";
	}
	
	

}
