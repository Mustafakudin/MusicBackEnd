package com.mustafakudin.Musicapp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mustafakudin.Musicapp.business.abstracts.AdminService;
import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.core.utilities.results.ErrorResult;
import com.mustafakudin.Musicapp.core.utilities.results.Result;
import com.mustafakudin.Musicapp.core.utilities.results.SuccessResult;
import com.mustafakudin.Musicapp.dataAccess.abstracts.AdminDao;
import com.mustafakudin.Musicapp.dataAccess.abstracts.AlbumDao;
import com.mustafakudin.Musicapp.dataAccess.abstracts.ArtistDao;
import com.mustafakudin.Musicapp.dataAccess.abstracts.SongDao;
import com.mustafakudin.Musicapp.dataAccess.abstracts.UserDao;
import com.mustafakudin.Musicapp.entities.concretes.Admin;
import com.mustafakudin.Musicapp.entities.concretes.Album;
import com.mustafakudin.Musicapp.entities.concretes.User;


public class AdminManager implements AdminService { 
	private AlbumDao albumDao;
	private SongDao songDao;
	private ArtistDao artistDao;
	private UserDao  userDao;
	private AdminDao adminDao;
	
	@Autowired
 public AdminManager(AlbumDao albumDao, SongDao songDao,ArtistDao artistDao,UserDao userDao) {
		this.albumDao=albumDao;
		this.artistDao=artistDao;
		this.songDao=songDao;
		this.userDao=userDao;
		
	}
	

	@Override
	public Result addAlbumForUser(User user, Album album) {
	
		return null;
	}


	@Override
	public Result add(Admin admin) {
		if(admin.getFirstName()==null||
				admin.getEmail()==null||
				admin.getLastName()==null||
				admin.getPassword()==null) {
			return new ErrorResult("lütfen tüm alanları doldurunuz");
		}
		else {
			adminDao.save(admin);
			return new SuccessResult("Sisteme kayıt edildi");
			
		}
	

	}
}



