package com.mustafakudin.Musicapp.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.core.utilities.results.Result;
import com.mustafakudin.Musicapp.entities.concretes.Album;
import com.mustafakudin.Musicapp.entities.concretes.User;

public interface AlbumService {

	DataResult<List<Album>> getAll();
	DataResult<List<Album>> getByAlbumNameContains(int pageNo, int pageSize);
	DataResult<List<Album>> getByAlbumName(int pageNo, int pageSize);  
	Result add(Album album); 
	

}
