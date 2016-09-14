package com.mysqlexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysqlexample.entity.User;
import com.mysqlexample.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public String createUser(String email, String name) {
		String returnValue;
		try {
			User user = new User(email, name);
			user = userRepository.save(user);
			returnValue = user.toString();
		} catch (Exception ex) {
			returnValue =  "Error creating the user: " + ex.toString();
		}
		return returnValue;
	}

	
	public String deleteUser(long userId){
	
		String returnValue = "User deleted";
		try {
		      User user = new User(userId);
		      userRepository.delete(user);
		    }
		    catch (Exception ex) {
		    	returnValue =  "Error deleting the user:" + ex.toString();
		    }
		return returnValue;
	}
	
	public String getUserByEmail(String email){
		
		String returnValue = "";
		
		try {
		      User user = userRepository.findByEmail(email);
		      returnValue = user.toString();
		    }
		    catch (Exception ex) {
		      returnValue =  "User not found";
		    }
		
		return returnValue;
	}
	
	public String updateUser(long id, String email, String name){
		String returnValue;
		try {
		      User user = userRepository.findOne(id);
		      user.setEmail(email);
		      user.setName(name);
		      user = userRepository.save(user);
		      returnValue = user.toString(); 
		    }
		    catch (Exception ex) {
		    	returnValue = "Error updating the user: " + ex.toString();
		    }
		return returnValue;
	}
	
	
}
