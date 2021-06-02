package com.mustafakudin.Musicapp.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.core.utilities.results.Result;
import com.mustafakudin.Musicapp.entities.concretes.Admin;
import com.mustafakudin.Musicapp.entities.concretes.Album;
import com.mustafakudin.Musicapp.entities.concretes.Artist;
import com.mustafakudin.Musicapp.entities.concretes.Song;
import com.mustafakudin.Musicapp.entities.concretes.User;

public interface AdminService {
	Result add(Admin admin);
     Result addAlbumForUser(User user , Album album);
  

	

 

}
