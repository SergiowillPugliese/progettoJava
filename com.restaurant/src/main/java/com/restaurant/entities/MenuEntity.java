package com.restaurant.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="menu")
public class MenuEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	String nome;
	
	@Column
	Double prezzo;
	
	@Column
	private String image;
	
	@Column
	private String categoria;

	@ManyToOne
	@JsonIgnore
	private RigheOrdineEntity righeOrdineEntity;

	public RigheOrdineEntity getRigheOrdineEntity() {
		return righeOrdineEntity;
	}

	public void setRigheOrdineEntity(RigheOrdineEntity righeOrdineEntity) {
		this.righeOrdineEntity = righeOrdineEntity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
