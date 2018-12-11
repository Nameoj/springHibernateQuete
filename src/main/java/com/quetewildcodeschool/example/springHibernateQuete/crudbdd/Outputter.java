package com.quetewildcodeschool.example.springHibernateQuete.crudbdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.quetewildcodeschool.example.springHibernateQuete.entity.User;
import com.quetewildcodeschool.example.springHibernateQuete.repositorie.UserDao;

@Component
public class Outputter implements CommandLineRunner {
	
	private Logger LOG = LoggerFactory.getLogger("wilder");
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("***********");
		LOG.info("Object in DB "+ userDao.count());
		
		// Create user 1
		User user1 = new User("Nicolas", "Barbier", "Lyon", 35);
		LOG.info("**************");
		LOG.info(user1 + " has been created");
		userDao.save(user1);
		LOG.info(user1 + " has been saved");
		
		
		// Create user 2
		User user2 = new User("Alex", "Guerin", "La Rochelle", 30);
		LOG.info("**************");
		LOG.info(user2 + " has been created");
		userDao.save(user2);
		LOG.info(user2 + " has been saved");
		
		
		// Create user 3
		User user3 = new User("Jean-Noël", "Bourat", "Lyon", 27);
		LOG.info("**************");
		LOG.info(user3 + " has been created");
		userDao.save(user3);
		LOG.info(user3 + " has been saved");
		
        // Read
		User tempUser = userDao.findById(1L).get();
		
		LOG.info("**********");
		LOG.info("third user's firstname is " + tempUser.getFirstName());
		LOG.info("third user's lastname is " + tempUser.getLastName());
		LOG.info("third user's city is " + tempUser.getCity());
		LOG.info("third user's age is " + tempUser.getAge());
		
		// List user
		LOG.info("****************");
		LOG.info("User in list are");
		for (User myUser : userDao.findAll()) {
			LOG.info(myUser.toString());
		};
		
		// Update
		user2.setFirstName("Aymeric");
		user2.setLastName("Neumann");
		user2.setCity("Chambery");
		user2.setAge(30);
		
		// Delete
		userDao.deleteById(1L);
		
		// Verif
		LOG.info("***********");
		LOG.info("Users in list are");
		for (User myUser : userDao.findAll()) {
			LOG.info(myUser.toString());
		};	
	}
}
