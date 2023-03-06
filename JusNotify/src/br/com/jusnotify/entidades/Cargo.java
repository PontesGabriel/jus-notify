package br.com.jusnotify.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cargo {

	private String nome;
	private long idCargo;
	private List<Usuario> listUsuario;

	public Cargo() {
		super();

		this.nome = "";
		this.idCargo = 0;
		this.listUsuario = new ArrayList<>();
	}

	public Cargo(String nome, long idCargo, List<Usuario> listUsuario) {
		super();
		this.nome = nome;
		this.idCargo = idCargo;
		this.listUsuario = listUsuario;
	}

	public long getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(long idCargo) {
		this.idCargo = idCargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Usuario> getListUsuario() {
		return listUsuario;
	}

	public void setListUsuario(List<Usuario> listUsuario) {
		this.listUsuario = listUsuario;
	}

	@Override
	public String toString() {
		return "Cargo [idCargo=" + idCargo + ", nome=" + nome + ", listUsuario=" + listUsuario + "]";
	}

}
