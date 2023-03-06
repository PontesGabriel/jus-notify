package br.com.jusnotify.entidades;

public class Documento {
	private long idDocumento;
	private String upload;
	private Prazo prazo;

	public Documento() {
		super();
		this.idDocumento = 0;
		this.upload = "";
		this.prazo = null;
	}

	public Documento(long idDocumento, String upload, Prazo prazo) {
		super();
		this.idDocumento = idDocumento;
		this.upload = upload;
		this.prazo = prazo;
	}

	public long getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(long idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getUpload() {
		return upload;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public Prazo getPrazo() {
		return prazo;
	}

	public void setPrazo(Prazo prazo) {
		this.prazo = prazo;
	}

	@Override
	public String toString() {
		return "Documento [idDocumento=" + idDocumento + ", upload=" + upload + ", prazo=" + prazo + "]";
	}

}
