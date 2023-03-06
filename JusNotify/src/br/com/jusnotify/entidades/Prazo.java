package br.com.jusnotify.entidades;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Prazo {

	private long idPrazo;
	private String status;
	private String observacoes;
	private Date dataInicial;
	private Date dataFinal;
	private boolean urgencia;
	private Time horario;
	private Processo processo;
	private Categoria categoria;
	private Usuario usuario;
	private List<Documento> listDocumento;

	public Prazo() {
		super();
		this.idPrazo = 0;
		this.status = "";
		this.observacoes = "";
		this.dataInicial = null;
		this.dataFinal = null;
		this.urgencia = false;
		this.horario = null;
		this.processo = null;
		this.categoria = null;
		this.usuario = null;
		this.listDocumento = new ArrayList<>();
	}

	public Prazo(long idPrazo, String status, String observacoes, Date dataInicial, Date dataFinal, boolean urgencia,
			Time horario, Processo processo, Categoria categoria, Usuario usuario, List<Documento> listDocumento) {
		super();
		this.idPrazo = idPrazo;
		this.status = status;
		this.observacoes = observacoes;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.urgencia = urgencia;
		this.horario = horario;
		this.processo = processo;
		this.categoria = categoria;
		this.usuario = usuario;
		this.listDocumento = listDocumento;
	}

	public long getIdPrazo() {
		return idPrazo;
	}

	public void setIdPrazo(long idPrazo) {
		this.idPrazo = idPrazo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public boolean isUrgencia() {
		return urgencia;
	}

	public void setUrgencia(boolean urgencia) {
		this.urgencia = urgencia;
	}

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Documento> getListDocumento() {
		return listDocumento;
	}

	public void setListDocumento(List<Documento> listDocumento) {
		this.listDocumento = listDocumento;
	}

	@Override
	public String toString() {
		return "Prazo [idPrazo=" + idPrazo + ", status=" + status + ", observacoes=" + observacoes + ", dataInicial="
				+ dataInicial + ", dataFinal=" + dataFinal + ", urgencia=" + urgencia + ", horario=" + horario
				+ ", processo=" + processo + ", categoria=" + categoria + ", usuario=" + usuario + ", listDocumento="
				+ listDocumento + "]";
	}

}
