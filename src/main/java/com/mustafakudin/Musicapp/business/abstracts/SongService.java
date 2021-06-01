package com.mustafakudin.Musicapp.business.abstracts;

import java.util.List;

import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.entities.concretes.Song;

public interface SongService {
	DataResult<List<Song>> getAll();
	//
}
