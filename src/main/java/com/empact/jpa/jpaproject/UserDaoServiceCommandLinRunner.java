package com.empact.jpa.jpaproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.empact.jpa.jpaproject.entity.user.User;
import com.empact.jpa.jpaproject.entity.user.service.UserDAOService;


@Component
public class UserDaoServiceCommandLinRunner implements CommandLineRunner{
	private static final Logger log =
			LoggerFactory.getLogger(UserDaoServiceCommandLinRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Emma", "Admin");
		User user2 = new User("Ade", "user");
		long insert = userDaoService.insert(user);
		userDaoService.insert(user2);
		log.info("New user is created: "+ user2);
		
		
	}

}
