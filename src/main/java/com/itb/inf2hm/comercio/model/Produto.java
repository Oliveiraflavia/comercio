package com.itb.inf2hm.comercio.model;

public class Produto {

	
	private long id;
	private String nome;
	private String codigoBarras;
	private double preco;
	private String descricao;
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

	
	// public  : Acesso liberado para todas as classes
	// private : Propriedade (atributo ou método) só pode ser acessado 
	//           dentro da própria classe
	
