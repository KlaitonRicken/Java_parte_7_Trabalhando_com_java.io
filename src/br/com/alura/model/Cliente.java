package br.com.alura.model;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = -460177764011166860L;
	private String nome;
	private String profissao;
	private int cpf;
	
	public String getNomeCpf() {
		return this.nome + ", " + cpf;
	}
	
	public String getNomeCpfProf() {
		return this.nome + ", " + cpf + ", " + this.profissao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
