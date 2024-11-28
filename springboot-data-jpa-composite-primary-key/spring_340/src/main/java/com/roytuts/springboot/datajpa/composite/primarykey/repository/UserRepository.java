package com.roytuts.springboot.datajpa.composite.primarykey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roytuts.springboot.datajpa.composite.primarykey.entity.User;
import com.roytuts.springboot.datajpa.composite.primarykey.entity.UserPKey;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserPKey(UserPKey userPKey);

}
