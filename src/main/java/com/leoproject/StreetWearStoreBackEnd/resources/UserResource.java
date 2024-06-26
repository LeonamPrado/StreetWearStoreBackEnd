package com.leoproject.StreetWearStoreBackEnd.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leoproject.StreetWearStoreBackEnd.entities.User;
import com.leoproject.StreetWearStoreBackEnd.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
	
	@Autowired
	private UserService service;
	

	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List <User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id){
		User p = service.findById(id);
		return ResponseEntity.ok().body(p);
	}
	
	@PostMapping
	public ResponseEntity<Boolean> createUser(@RequestBody User user){
		Boolean createdUser = service.registerUser(user);
		return new ResponseEntity<>(createdUser, HttpStatus.OK);
	}
	
	@PostMapping(value = "/login")
	public ResponseEntity<User> loginUser(@RequestBody User user){
		User login = service.loginUser(user);
		return new ResponseEntity<>(login, HttpStatus.OK);
	}
	
}
