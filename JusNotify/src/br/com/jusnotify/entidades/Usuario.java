package br.com.jusnotify.entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private long idUsuario;
	private String senha;
	private String email;
	private String nome;
	private int cpf;
	private Cargo cargo;
	private List<Processo> listProcesso;
	private List<Prazo> listPrazo;

	public Usuario() {

		super();
		this.idUsuario = 0;
		this.senha = "";
		this.email = "";
		this.nome = "";
		this.cpf = 0;
		this.cargo = null;
		this.listProcesso = new ArrayList<>();
		this.listPrazo = new ArrayList<>();

	}

	public Usuario(long idUsuario, String senha, String email, String nome, int cpf, Cargo cargo,
			List<Processo> listProcesso, List<Prazo> listPrazo) {
		super();
		this.idUsuario = idUsuario;
		this.senha = senha;
		this.email = email;
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.listProcesso = listProcesso;
		this.listPrazo = listPrazo;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public List<Processo> getListProcesso() {
		return listProcesso;
	}

	public void setListProcesso(List<Processo> listProcesso) {
		this.listProcesso = listProcesso;
	}

	public List<Prazo> getListPrazo() {
		return listPrazo;
	}

	public void setListPrazo(List<Prazo> listPrazo) {
		this.listPrazo = listPrazo;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", senha=" + senha + ", email=" + email + ", nome=" + nome + ", cpf="
				+ cpf + ", cargo=" + cargo + ", listProcesso=" + listProcesso + ", listPrazo=" + listPrazo + "]";
	}

}
