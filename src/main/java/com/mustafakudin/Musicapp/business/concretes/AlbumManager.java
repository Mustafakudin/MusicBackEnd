package com.mustafakudin.Musicapp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.mustafakudin.Musicapp.business.abstracts.AlbumService;
import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.core.utilities.results.Result;
import com.mustafakudin.Musicapp.core.utilities.results.SuccessDataResult;
import com.mustafakudin.Musicapp.dataAccess.abstracts.AlbumDao;
import com.mustafakudin.Musicapp.entities.concretes.Album;

public class AlbumManager implements AlbumService{
	private AlbumDao albumDao;
	
	@Autowired
	public AlbumManager(AlbumDao albumDao) {
		this.albumDao=albumDao;
	}

	@Override
	public DataResult<List<Album>> getByAlbumName(int pageNo, int pageSize) {
		Pageable pageable=PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<Album>>(this.albumDao.getByAlbumName(pageable),"data listelendi");
		
	}

	@Override
	public Result add(Album album) {
		return null;
	}

	@Override
	public DataResult<List<Album>> getAll() {
		return null;
	}

	@Override
	public DataResult<List<Album>> getByAlbumNameContains(int pageNo, int pageSize) {
		Pageable pageable=PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<Album>>(this.albumDao.getByAlbumNameContains(pageable),"data listelendi");
	}

}
