package com.mustafakudin.Musicapp.business.abstracts;

import java.util.List;

import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.core.utilities.results.Result;
import com.mustafakudin.Musicapp.entities.concretes.Album;
import com.mustafakudin.Musicapp.entities.concretes.Artist;
import com.mustafakudin.Musicapp.entities.concretes.Song;
import com.mustafakudin.Musicapp.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
	DataResult<List<User>> getBySubscribeType(boolean subscribeType); 

	
}
