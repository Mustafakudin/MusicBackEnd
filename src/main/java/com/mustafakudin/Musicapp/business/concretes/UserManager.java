package com.mustafakudin.Musicapp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafakudin.Musicapp.business.abstracts.UserService;
import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.core.utilities.results.ErrorDataResult;
import com.mustafakudin.Musicapp.core.utilities.results.ErrorResult;
import com.mustafakudin.Musicapp.core.utilities.results.Result;
import com.mustafakudin.Musicapp.core.utilities.results.SuccessDataResult;
import com.mustafakudin.Musicapp.core.utilities.results.SuccessResult;
import com.mustafakudin.Musicapp.dataAccess.abstracts.AlbumDao;
import com.mustafakudin.Musicapp.dataAccess.abstracts.SongDao;
import com.mustafakudin.Musicapp.dataAccess.abstracts.UserDao;
import com.mustafakudin.Musicapp.entities.concretes.User;

@Service
public class UserManager implements UserService{

	
	private UserDao userDao;
	private AlbumDao albumDao;
	private SongDao songDao;
	
	@Autowired
	public UserManager(UserDao userDao,AlbumDao albumDao,SongDao songDao) {
		this.userDao=userDao;
		this.albumDao=albumDao;
		this.songDao=songDao;
	}
	
	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data listelendi");
	}

	@Override
	public DataResult<List<User>> getBySubscribeType(boolean subscribeType) {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"data listelendi");
	}

	

	@Override
	public Result add(User user) {
		if(user.getFirstName()==null||
				user.getPassword()==null||
				user.getEmail()==null||
				user.getCountry()==null) {
			return new ErrorResult("Bütün alanları doldurunuz");
		}
		else {
			userDao.save(user);
			return new SuccessResult("işlem başarılı kayıt oldunuz");
		}
			
	}
	
	

	
}
