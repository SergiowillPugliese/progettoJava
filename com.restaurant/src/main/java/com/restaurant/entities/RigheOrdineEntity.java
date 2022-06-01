package com.restaurant.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "righe_ordine")
public class RigheOrdineEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer id;
	
	@Column
	@OneToMany
	private List<OrdineEntity> ordineEntity;
	
	@Column
	@OneToMany
	private List<MenuEntity> menu;
	
	@Column
	private Integer quantita;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<OrdineEntity> getOrdineEntity() {
		return ordineEntity;
	}

	public void setOrdineEntity(List<OrdineEntity> ordineEntity) {
		this.ordineEntity = ordineEntity;
	}

	public List<MenuEntity> getMenu() {
		return menu;
	}

	public void setMenu(List<MenuEntity> menu) {
		this.menu = menu;
	}

	public Integer getQuantita() {
		return quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
}
