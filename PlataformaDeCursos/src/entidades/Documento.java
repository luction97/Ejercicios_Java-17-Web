package entidades;

public class Documento {
	private String tipoDocumento;
	private int numeroDocumento;

	public Documento(String tipoDocumento, int numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	@Override
	public String toString() {

		switch (tipoDocumento) {
		case "DNI":
			System.out.println("Documento nacional de identidad.");
		case "PAS":
			System.out.println("Pasaporte.");
		case "LE":
			System.out.println("Libreta de enrolamiento.");
		case "CI":
			System.out.println("Cédula de identidad");	
		}

		return "Documento [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + "]";
	}

}
