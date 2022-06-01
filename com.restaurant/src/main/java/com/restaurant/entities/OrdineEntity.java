package com.restaurant.entities;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@DynamicUpdate
@DynamicInsert
@Entity
@Table(name="ordine")
public class OrdineEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private Integer coperti;
	
	@Column
	private Integer tavolo;
	
	@Column
	private Boolean pagato;
	
	@Column
	//private StaffEntity staff;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCoperti() {
		return coperti;
	}

	public void setCoperti(Integer coperti) {
		this.coperti = coperti;
	}

	public Integer getTavolo() {
		return tavolo;
	}

	public void setTavolo(Integer tavolo) {
		this.tavolo = tavolo;
	}

	public Boolean getPagato() {
		return pagato;
	}

	public void setPagato(Boolean pagato) {
		this.pagato = pagato;
	}

	/*public StaffEntity getStaff() {
		return staff;
	}

	public void setStaff(StaffEntity staff) {
		this.staff = staff;
	}*/
	
	

}
