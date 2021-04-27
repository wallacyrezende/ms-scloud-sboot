package com.devwall.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devwall.hroauth.entities.User;
import com.devwall.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {
	
	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail (String email) {
		
		User user = userFeignClient.findByEmail(email).getBody();
		
		if(user == null) {
			logger.error("E-mail not found: ".concat(email));
			throw new IllegalArgumentException("E-mail not found");
		}
		logger.info("E-mail found: ".concat(email));
		return user;
	}

}
