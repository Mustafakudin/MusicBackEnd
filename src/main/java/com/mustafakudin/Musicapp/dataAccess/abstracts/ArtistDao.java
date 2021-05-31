package com.mustafakudin.Musicapp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafakudin.Musicapp.entities.concretes.Artist;


public interface ArtistDao extends JpaRepository<Artist, Integer> {

	Artist getById(int artistId);
	Artist getByName(String artistName);
}
