package com.mustafakudin.Musicapp.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafakudin.Musicapp.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User getById(int id);
	User getByName(String userName);
	List<User> getByEmail(String email);
	List<User> getBySubscribeType(boolean subscribeType); 

}
