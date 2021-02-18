package com.craterzone.demo.exception;

import org.springframework.http.HttpStatus;

public class UserException extends Exception{
     public String message;
 
	 public UserException(String str1,HttpStatus str2){
	      message = str1+"  , "+str2;
	 }
	 public String toString() {
	      return ("User Exception Occurred : " + message);
	 }	
}