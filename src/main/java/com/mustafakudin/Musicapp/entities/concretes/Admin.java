package com.mustafakudin.Musicapp.entities.concretes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="admins")
@PrimaryKeyJoinColumn(name="id", referencedColumnName = "id")

public class Admin extends BaseUser {
		@Column(name="first_name")
		private String firstName ;
		
		@Column(name="last_name")
		private String lastName;
		
		
		
		
		
		

}
