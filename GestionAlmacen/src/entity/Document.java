package entity;

public class Document {
	String tipeDocument;
	String numberDocument;

	public Document(String tipeDocument, String numberDocument) {
		this.tipeDocument = tipeDocument;
		this.numberDocument = numberDocument;
	}

	public Document() {

	}

	public String getTipeDocument() {
		return tipeDocument;
	}

	public void setTipeDocument(String tipeDocument) {
		this.tipeDocument = tipeDocument;
	}

	public String getNumberDocument() {
		return numberDocument;
	}

	public void setNumberDocument(String numberDocument) {
		this.numberDocument = numberDocument;
	}

}
