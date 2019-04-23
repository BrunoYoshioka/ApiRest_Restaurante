package com.restaurantes.apirest.models;

/**
 * Essa classe irá representar uma entidade no Banco de dados
 * @Autor Bruno Yoshioka
 */

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Anotação @Entity para mapear uma entidade do banco de dados
 * Anotação @Table para personalizar o nome da tabela 
 * @author bruno
 *
 */
@Entity
@Table(name="RESTAURANTES")
public class Restaurante implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * As seguintes anotações indica que irá gerar Id automaticamente 
	 * ao cadastrar no Banco de Dados
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	private String nome;
	

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

}
