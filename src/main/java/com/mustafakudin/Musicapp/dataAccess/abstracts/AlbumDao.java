package com.mustafakudin.Musicapp.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafakudin.Musicapp.entities.concretes.Album;

public interface AlbumDao extends JpaRepository<AlbumDao, Integer> {

	//Album getById(int albumId);
	Album getByName(String albumName);
	List<Album> getByAlbumName(Pageable pageable);
	List<Album> getByAlbumNameContains(Pageable pageable);
}
