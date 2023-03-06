package br.com.jusnotify.entidades;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Processo {

	private long idProcesso;
	private Usuario usuario;
	private String reclamante;
	private String reclamada;
	private String assunto;
	private String cartorio;
	private String fase;
	private String contato;
	private Date data;
	private List<Prazo> listPrazo;

	public Processo() {
		super();
		this.idProcesso = 0;
		this.usuario = null;
		this.reclamante = "";
		this.reclamada = "";
		this.assunto = "";
		this.cartorio = "";
		this.fase = "";
		this.contato = "";
		this.data = null;
		this.listPrazo = new ArrayList<>();
	}

	public Processo(long idProcesso, Usuario usuario, String reclamante, String reclamada, String assunto,
			String cartorio, String fase, String contato, Date data, List<Prazo> listPrazo) {
		super();
		this.idProcesso = idProcesso;
		this.usuario = usuario;
		this.reclamante = reclamante;
		this.reclamada = reclamada;
		this.assunto = assunto;
		this.cartorio = cartorio;
		this.fase = fase;
		this.contato = contato;
		this.data = data;
		this.listPrazo = listPrazo;
	}

	public long getIdProcesso() {
		return idProcesso;
	}

	public void setIdProcesso(long idProcesso) {
		this.idProcesso = idProcesso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getReclamante() {
		return reclamante;
	}

	public void setReclamante(String reclamante) {
		this.reclamante = reclamante;
	}

	public String getReclamada() {
		return reclamada;
	}

	public void setReclamada(String reclamada) {
		this.reclamada = reclamada;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getCartorio() {
		return cartorio;
	}

	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Prazo> getListPrazo() {
		return listPrazo;
	}

	public void setListPrazo(List<Prazo> listPrazo) {
		this.listPrazo = listPrazo;
	}

	@Override
	public String toString() {
		return "Processo [idProcesso=" + idProcesso + ", usuario=" + usuario + ", reclamante=" + reclamante
				+ ", reclamada=" + reclamada + ", assunto=" + assunto + ", cartorio=" + cartorio + ", fase=" + fase
				+ ", contato=" + contato + ", data=" + data + ", listPrazo=" + listPrazo + "]";
	}

}
