package com.mustafakudin.Musicapp.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="admins")
@Inheritance(strategy = InheritanceType.JOINED)

public class Role extends BaseUser {
	
	

	@Column(name="name")
	private String name ;
	
	@Column(name="path")
	private String path;
	

}
