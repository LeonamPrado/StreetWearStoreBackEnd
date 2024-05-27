package com.leoproject.StreetWearStoreBackEnd.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leoproject.StreetWearStoreBackEnd.entities.User;
import com.leoproject.StreetWearStoreBackEnd.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Integer id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
	
	public String registerUser(User user) {
		if(userRepository.findByEmail(user.getEmail()) == null) {
			userRepository.saveAll(Arrays.asList(user));
			return "User Created" ;
		}else {
			return "Email already in use";
		}
	}
	
	public Boolean loginUser(User user) {
		if(userRepository.findByPasswordAndEmail(user.getPassword(), user.getEmail()) == null) {
			return false;
		}else {
			return true;
		}
	}
}

