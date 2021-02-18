package com.craterzone.demo.gateway;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.craterzone.demo.client.UserClient;
import com.craterzone.demo.exception.UserException;
import com.craterzone.demo.model.User;

import retrofit2.Response;

@Component
public class UserGateway 
{
//private static final Logger logger = LoggerFactory.getLogger(UserGateway.class);
@Autowired
private UserClient masterClient;

public Optional<User> getUser(int id) throws UserException 
{
  Response<User> userResponse = masterClient.getUserById(id).blockingGet();
  
	if (userResponse.code() == HttpStatus.NO_CONTENT.value())
		throw new UserException("USER_NOT_FOUND", HttpStatus.BAD_REQUEST);

	if (!userResponse.isSuccessful()) 
		throw new UserException("USER_NOT_FOUND", HttpStatus.BAD_REQUEST);
  
return Optional.of(userResponse.body());
}   
}