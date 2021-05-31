package com.mustafakudin.Musicapp.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.core.utilities.results.Result;
import com.mustafakudin.Musicapp.entities.concretes.Admin;
import com.mustafakudin.Musicapp.entities.concretes.Album;
import com.mustafakudin.Musicapp.entities.concretes.Artist;
import com.mustafakudin.Musicapp.entities.concretes.Song;

public interface AdminService {
	DataResult<List<Admin>> getById(int Id);
	DataResult<List<Album>> getByAlbumName(Pageable pageable);  
	DataResult<List<Song>>  getBySongName(String songName);
	DataResult<List<Artist>> getByArtistName(String artistName);
//	DataResult<List<Admin>> getall(); 1 adminimiz var 
	Result add(Album album);
	Result add(Artist artist);
	Result add(Song song);

}
