package entidades;

public class Impresora {
	private MarcaImpresora tipoimpresora;
	// Contenido a imprimir
	private String[] documento;

	public Impresora(MarcaImpresora tipoimpresora, String[] documento) {
		super();
		this.tipoimpresora = tipoimpresora;
		this.documento = documento;
	}

	
	
	public void imprimir() {
		
	}
	
	public MarcaImpresora getTipoimpresora() {
		return tipoimpresora;
	}

	public void setTipoimpresora(MarcaImpresora tipoimpresora) {
		this.tipoimpresora = tipoimpresora;
	}

	public String[] getDocumento() {
		return documento;
	}

	public void setDocumento(String[] documento) {
		this.documento = documento;
	}

}
