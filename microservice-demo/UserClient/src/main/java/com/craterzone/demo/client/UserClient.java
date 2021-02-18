package com.craterzone.demo.client;


import com.craterzone.demo.model.User;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;;

public interface UserClient {
	
	@GET("/api/v1/users/{id}")
	public
	Single<Response<User>> getUserById(@Path(value="id") int id);

}
