package com.mustafakudin.Musicapp.business.abstracts;

import java.util.List;

import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.entities.concretes.Artist;

public interface ArtistService {
	DataResult<List<Artist>> getAll();
	
}
