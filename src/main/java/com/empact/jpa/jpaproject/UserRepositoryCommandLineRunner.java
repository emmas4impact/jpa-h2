package com.empact.jpa.jpaproject;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.empact.jpa.jpaproject.entity.user.User;

import com.empact.jpa.jpaproject.entity.user.service.UserRepository;


@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
	private static final Logger log =
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("Kenny", "Admin");
		//User user2 = new User("Ade", "user");
		userRepository.save(user);
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("User is retreived: "+ userWithIdOne);
		
		List<User> users = userRepository.findAll();
		
		log.info("All user is retrieved: "+ users);
		
		log.info("New user is created: "+ user);
		
		
	}

}
