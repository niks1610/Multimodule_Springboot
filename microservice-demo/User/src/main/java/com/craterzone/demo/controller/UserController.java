package com.craterzone.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.craterzone.demo.exception.UserException;
import com.craterzone.demo.model.User;
import com.craterzone.demo.service.UserService;

import retrofit2.Response;

import java.util.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	@Autowired
	private UserService usersService;
	
	
//	@PostMapping("/")
//	public ResponseEntity<User> register(@Valid @RequestBody User user){
//			 Optional<User> user1= usersService.saveUser(user);
//			 //not null
//			 if(!Objects.isNull(user1)) {
//				 return ResponseEntity.status(HttpStatus.CREATED).body(user);
//			 }	
//		
//		return ResponseEntity.badRequest().build();
//	}
//	
//	@PostMapping("/login")
//	public ResponseEntity<Optional<User>> login(@Valid @RequestBody User user){
//		Optional<User> userDB = usersService.getUser(user);
//		if(userDB!=null){
//			return ResponseEntity.status(HttpStatus.ACCEPTED).body(userDB);
//		}
//		
//		return ResponseEntity.badRequest().build();
//		
//	}
//	
//	@GetMapping("/All")
//	public ResponseEntity<Optional<List<User>>> getAll()
//	{
//		Optional<List<User>> list = usersService.getAll();
//		if(list!=null)
//		 return ResponseEntity.status(HttpStatus.OK).body(list);
//		
//		return ResponseEntity.noContent().build();
//	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable(name = "id") int id) throws UserException{
		Optional<User> result = usersService.getUserById(id);
		if(result!=null){
			return ResponseEntity.status(HttpStatus.OK).body(Optional.of(result.get()));
		}
		return ResponseEntity.badRequest().build();
	}
//	@PatchMapping("{id}/address")
//	public ResponseEntity<User> updateAddress(@PathVariable(name = "id") int id,@RequestBody Address address)
//	{
//		Optional<User> user = usersService.updateAddress(id, address);//
//		 if(user.isPresent())
//		 {
//			 return ResponseEntity.status(HttpStatus.OK).body(user.get());
//		 }
//		
//		   
//		
//		  return ResponseEntity.badRequest().build();
//		
		
//		 int k =usersService.updateAddress(id, address);
//			
//		    if(k>0)
//		    	return ResponseEntity.status(HttpStatus.OK).body(null);
//		    else
//		    	return ResponseEntity.noContent().build();
		
//	}
	
//	/*
//	 * @DeleteMapping("deleteuser") public void delete(int id) {
//	 * reqservice.delete(id); }
//	 */
	
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity delete(@PathVariable(name = "id") int id){
//		boolean result = usersService.deleteUser(id);
//		if(result){
//			return ResponseEntity.status(HttpStatus.OK).body(null);
//		}
//		return ResponseEntity.badRequest().build();
//	}
	
}


 
