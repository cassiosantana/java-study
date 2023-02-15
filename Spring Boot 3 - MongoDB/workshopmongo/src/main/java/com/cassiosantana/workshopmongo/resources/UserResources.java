package com.cassiosantana.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cassiosantana.workshopmongo.domain.User;
import com.cassiosantana.workshopmongo.services.UserServices;

@RestController
@RequestMapping(value ="/users" )
public class UserResources {
	
	@Autowired
	private UserServices service;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}