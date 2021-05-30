package com.mustafakudin.Musicapp.business.abstracts;

import java.util.List;

import com.mustafakudin.Musicapp.entities.concretes.Album;

public interface AlbumService {

	List<Album> findAll();

	List<Album> findBykind(String album_kind);

	Album findById(String id);

	List<Album> findByName(String album_name);

}
