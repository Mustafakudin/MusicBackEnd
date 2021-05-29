package com.mustafakudin.Musicapp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafakudin.Musicapp.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
