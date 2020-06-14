package com.practice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.springboot.model.Account;
import com.practice.springboot.model.Mobile;
import com.practice.springboot.model.User;
import com.practice.springboot.service.UserService;

@SpringBootApplication
public class ApplicationEngine {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ApplicationEngine.class);
	
		
		User user = applicationContext.getBean(User.class);
		user.setEmail("prince220600@gmail.com");
		user.setName("prince");
		
		Account account = applicationContext.getBean(Account.class);
		account.setAccounType("saving");
		account.setAmount("10000");
		account.setUser(user);
		
		Mobile mobile = applicationContext.getBean(Mobile.class);
		mobile.setMobileCost(20000);
		mobile.setMobileName("samsung");
		mobile.setUser(user);
		
		UserService service = applicationContext.getBean(UserService.class);
		service.saveUserMobile(mobile);
		//service.saveUserAccount(account);
		//service.saveUser(user);
		//service.findUser(null, null);
		//service.findUserByName();
		
	}
	

}
