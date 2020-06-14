package com.practice.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.springboot.model.Account;
import com.practice.springboot.model.Mobile;
import com.practice.springboot.model.User;
import com.practice.springboot.repository.AccountRepository;
import com.practice.springboot.repository.MobileRepository;
import com.practice.springboot.repository.UserRepository;

@Service
public class UserService {
	@Autowired private UserRepository userRepo;
	@Autowired private AccountRepository accountRepository;
	@Autowired private MobileRepository mobileRepo;
	public void saveUser(User user){
		System.out.println("value retured after saving the user::"+userRepo.save(user));	
	}
	public void findUser(Integer id){
		System.out.println("userfound::"+userRepo.findById(id));
	}
	
	public void findUserByName(String name){
		System.out.println("userFound::"+userRepo.findUserBy(name));
	}
	public void saveUserAccount(Account account){
		System.out.println("saved user account::"+accountRepository.save(account));
		
	}
	public void saveUserMobile(Mobile mobile){
		System.out.println("user mobile saved::"+mobileRepo.save(mobile));
		
	}

}
