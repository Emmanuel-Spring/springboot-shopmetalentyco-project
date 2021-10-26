package com.talentyco.springboot.models.entity;

import javax.persistence.*;


@MappedSuperclass
@Entity
public abstract class IdBasedEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	
	public Integer getId()  {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	
}
