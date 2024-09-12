package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.UserEntity;

//repository is same like a Dao : data access object
//repository is use for the make the operation on the database

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
	//insert
		//update 
		//delete 
		//select 
		//sort 
}
