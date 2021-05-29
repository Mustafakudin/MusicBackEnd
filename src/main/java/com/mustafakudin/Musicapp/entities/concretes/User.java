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
@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED) // sadece baglamaya bagırıyor
public class User extends BaseUser{
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="subscribe_type")
	private boolean subscribeType;
	
	@Column(name="country")
	private String country;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	

}
