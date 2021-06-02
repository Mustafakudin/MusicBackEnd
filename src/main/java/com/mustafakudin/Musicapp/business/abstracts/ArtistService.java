package com.mustafakudin.Musicapp.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.core.utilities.results.Result;
import com.mustafakudin.Musicapp.entities.concretes.Album;
import com.mustafakudin.Musicapp.entities.concretes.Artist;

public interface ArtistService {
	DataResult<List<Artist>> getAll();
	Result add(Artist artist); 
	DataResult<List<Artist>> getByArtistNameContains(int pageNo, int pageSize);
	//
}
