package com.craterzone.demo.config;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.craterzone.demo.client.UserClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Configuration
public class UserConfig 
{
@Bean
public UserClient masterClient(@Value("${connection.read.timeout.second}") final Long timeoutSeconds, @Value("${master.base.url}") final String baseUrl) 
{
		 return new Retrofit.Builder()
		.client(new OkHttpClient.Builder().readTimeout(timeoutSeconds, TimeUnit.SECONDS)
		.connectTimeout(timeoutSeconds, TimeUnit.SECONDS)
		.addInterceptor(new HttpLoggingInterceptor().setLevel(Level.BASIC)).build())
		.baseUrl(baseUrl).addConverterFactory(JacksonConverterFactory.create(buildDefaultMapper()))
		//.addConverterFactory(ScalarsConverterFactory.create())
		.addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build().create(UserClient.class);
}

/* Builds the default object mapper to be used by clients to parse/populate Json object.
  	@return the {@link ObjectMapper} prepared with default configuration.
*/
private ObjectMapper buildDefaultMapper() 
{
	final ObjectMapper objectMapper = new ObjectMapper();
	objectMapper.registerModule(new JavaTimeModule());
	objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	return objectMapper;
}

}