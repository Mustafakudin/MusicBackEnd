package com.mustafakudin.Musicapp.entities.concretes;

import java.util.Date;

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
@Table(name="song")
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "artist_id",referencedColumnName = "id")
public class Song {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="artist_id")
	private int artistId;
	
	@Column(name="album_id")
	private int albumId;
	
	@Column(name="song_name")
	private String songName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="song_date")
	private Date songDate;
	
	@Column(name="song_kind")
	private String songKind;
	
	@Temporal(TemporalType.TIME)
	@Column(name="song_time")
	private Date songTime;
	
	@Column(name="song_rest")
	private String songRest;
	
	

}
