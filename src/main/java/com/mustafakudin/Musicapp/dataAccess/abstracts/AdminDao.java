package com.mustafakudin.Musicapp.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafakudin.Musicapp.entities.concretes.Admin;
import com.mustafakudin.Musicapp.entities.concretes.Album;
import com.mustafakudin.Musicapp.entities.concretes.Artist;
import com.mustafakudin.Musicapp.entities.concretes.Song;

public interface AdminDao extends JpaRepository<AdminDao, Integer> {
	
	List<Admin> getById(int Id);
	List<Album> getByAlbumName(String albumName);  // şimdilik pageable kalsın 
	List<Song>  getBySongName(String songName);
	List<Artist> getByArtistName(String artistName);
	List<Song>getBySongNameContains(String songName);
	
	

}
