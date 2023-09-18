package entity;

//final es para que no pueda heredarse
public final class Documento {
	
	String tipoDocumento;
	int numeroDocumento;

	// constructor con todos los atributos
	public Documento(String tipoDocumento, int numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	String mostrarAtributos() {
		return "tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento;
	}
	
}
