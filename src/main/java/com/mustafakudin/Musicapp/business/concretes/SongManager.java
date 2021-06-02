package com.mustafakudin.Musicapp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mustafakudin.Musicapp.business.abstracts.SongService;
import com.mustafakudin.Musicapp.core.utilities.results.DataResult;
import com.mustafakudin.Musicapp.core.utilities.results.Result;
import com.mustafakudin.Musicapp.core.utilities.results.SuccessDataResult;
import com.mustafakudin.Musicapp.dataAccess.abstracts.SongDao;
import com.mustafakudin.Musicapp.entities.concretes.Song;

public class SongManager implements SongService{
	
	private SongDao songDao;
	@Autowired
	public SongManager(SongDao songDao) {
		this.songDao=songDao;
	}

	@Override
	public DataResult<List<Song>> getAll() {
		return new SuccessDataResult<List<Song>>(this.songDao.findAll(),"Data listelendi");
	}

	@Override
	public DataResult<List<Song>> getBySongName(String songName) {
		return new SuccessDataResult<List<Song>>(this.songDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(Song song) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
