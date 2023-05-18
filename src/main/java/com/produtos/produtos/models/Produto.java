package com.produtos.produtos.models;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity//identifica que vai ser uma entidade do banco
@Table(name="TB_produto")//o nome da table
//serialização com o implements...
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;//numero da versao do serial
	
	@Id//indica que é a chave primaria ID
	@GeneratedValue(strategy=GenerationType.AUTO)//especifica o tipo de geração de chave
	private long id;
	
	private String nome;
	private BigDecimal quantidade;
	private BigDecimal Valor;
	//getters and setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValor() {
		return Valor;
	}
	public void setValor(BigDecimal valor) {
		 this.Valor = valor;
	}
	
}
