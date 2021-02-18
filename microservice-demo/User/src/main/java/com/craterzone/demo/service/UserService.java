package com.craterzone.demo.service;

import java.util.*;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craterzone.demo.exception.UserException;
import com.craterzone.demo.gateway.UserGateway;
import com.craterzone.demo.model.User;

import retrofit2.Response;



@Service
public class UserService {

	@Autowired
	private UserGateway repo;
	
	
//	public Optional<User> saveUser(User user)
//	{
//		Optional<UserDao> userDb=repo.findByEmail(user.getEmail());
//		if(userDb.isPresent()){
//			return null;
//		}
//		
//		UserDao userDao = UserMapper.UserToUserDao(user);
//		AddressDao addressDao = UserMapper.addressToAddressDao(user.getAddress());
//		addressDao.setUser(userDao);
//		ContactDao contactDao = UserMapper.contactToContactDao(user.getContact());
//		contactDao.setUser(userDao);
//		userDao = repo.save(userDao);
//		return Optional.of(user);
//		
//	}
//	
//	public Optional<User> getUser(User user){
//		Optional<UserDao> userDb=repo.findByEmail(user.getEmail());
//		if(userDb.isPresent()){
//			if(userDb.get().getPassword().equals(user.getPassword())){
//				return Optional.of(UserMapper.UserDaoToUser(userDb.get()));
//			}
//		}
//		return null;
//	}
	
	public Optional<User> getUserById(int id) throws UserException{
		Optional<User> user = repo.getUser(id);
		if(user!=null)
		{
			return Optional.of(user.get());
		}
		return null;
		
	}
//    public Optional<List<User>> getAll(){
//    	List<UserDao> list = repo.findAll();
//    	return Optional.of(UserMapper.UserDaoListToUserList(list));	
//    }
//	
//    public  Optional<User> updateAddress(int id,Address address){
//    	 Optional<UserDao> user = repo.findById(id);
//    	 
//    	 if(user.isPresent()) {
//    		// AddressDao addressDao =UserMapper.addressToAddressDao(address);
//    		 
//    		 AddressDao addressToUpdate = user.get().getAddress();
//    		 BeanUtils.copyProperties(address, addressToUpdate);
//    		 
//    		 repo.save(user.get());
//    	 }
//    	 
//    	 return Optional.of(UserMapper.UserDaoToUser(user.get()));
//    	
//    	
////    	AddressDao addressDao =UserMapper.addressToAddressDao(address);
////    	return repo.updateAddress(addressDao,id);
//    	
//    	
//    	
//    	
//    	
//    }
//    
//    public boolean deleteUser(int id)
//    {
//    	Optional<UserDao> user = repo.findById(id);
//    	
//    	if(user.isPresent())
//    	{
//    		repo.delete(user.get());
//    		return true;
//    	}
//    	
//    	return false;
//    }
}
