package br.com.jusnotify.entidades;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private long idCategoria;
	private String nome;
	private List<Prazo> listPrazo;

	public Categoria() {
		super();
		this.idCategoria = 0;
		this.nome = "";
		this.listPrazo = new ArrayList<>();

	}

	public Categoria(long idCategoria, String nome, List<Prazo> listPrazo) {
		super();
		this.idCategoria = idCategoria;
		this.nome = nome;
		this.listPrazo = listPrazo;
	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Prazo> getListPrazo() {
		return listPrazo;
	}

	public void setListPrazo(List<Prazo> listPrazo) {
		this.listPrazo = listPrazo;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nome=" + nome + ", listPrazo=" + listPrazo + "]";
	}

}
