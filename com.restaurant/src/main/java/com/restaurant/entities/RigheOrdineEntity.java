package com.restaurant.entities;

import javax.persistence.*;

@Entity
@Table(name = "righe_ordine")
public class RigheOrdineEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer id;
	
	//@Column
	//@OneToMany
	//private OrdineEntity ordineEntity;
	
	//@Column
	//@OneToMany
	//private MenuEntity menu;
	
	@Column
	private Integer quantita;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*public OrdineEntity getOrdineEntity() {
		return ordineEntity;
	}

	public void setOrdineEntity(OrdineEntity ordineEntity) {
		this.ordineEntity = ordineEntity;
	}*/

	/*public MenuEntity getMenu() {
		return menu;
	}

	public void setMenu(MenuEntity menu) {
		this.menu = menu;
	}*/

	public Integer getQuantita() {
		return quantita;
	}

	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	
	
	
	
}
