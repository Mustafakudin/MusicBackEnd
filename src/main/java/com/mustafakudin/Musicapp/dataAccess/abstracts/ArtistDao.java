package com.mustafakudin.Musicapp.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafakudin.Musicapp.entities.concretes.Artist;


public interface ArtistDao extends JpaRepository<Artist, Integer> {

	//Artist getById(int artistId); default olarak olusuyor zaten
	Artist getByName(String artistName);
	List<Artist> getByArtistName(String artistName);
	List<Artist> getByArtistNameContains(Pageable pageable);
}
