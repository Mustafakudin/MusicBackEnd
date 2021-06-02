package com.mustafakudin.Musicapp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mustafakudin.Musicapp.business.abstracts.ArtistService;
import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.core.utilities.results.Result;
import com.mustafakudin.Musicapp.core.utilities.results.SuccessDataResult;
import com.mustafakudin.Musicapp.dataAccess.abstracts.ArtistDao;
import com.mustafakudin.Musicapp.entities.concretes.Artist;

public class ArtistManager implements ArtistService{
	
	private ArtistDao artistDao;
	@Autowired
	public ArtistManager(ArtistDao artistDao) {
		this.artistDao=artistDao;
	}

	@Override
	public DataResult<List<Artist>> getAll() {
		return new SuccessDataResult<List<Artist>>(this.artistDao.findAll(),"data listelendi");
	}
	@Override // ismi misal mustafa sarkıcıları  olanları sayfalattırdım 
	public DataResult<List<Artist>> getByArtistNameContains(int pageNo, int pageSize) {
		return new SuccessDataResult<List<Artist>>(this.artistDao.findAll(),"Data listelendi");
	}
	@Override
	public Result add(Artist artist) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
}
