package com.mustafakudin.Musicapp.entities.concretes;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="album")
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "album_id")
public class Album {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="artist_id")
	private int artistId;
	@Column(name="album_name")
	private String albumName;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="album_date")
	private Date albumDate;
	@Column(name="album_kind")
	private String albumKind;
	

}
