package com.practice.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practice.springboot.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
 
	@Query(value="select u from User u where u.name= ?1")
	Object findUserBy(String name);
	// here we can add addition one more parameter Sort class object, which will work as order by clause
	//"?1" this will take the value of the name property
}
