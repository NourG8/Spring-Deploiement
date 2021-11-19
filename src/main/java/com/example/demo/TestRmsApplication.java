package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;


@SpringBootApplication
public class TestRmsApplication implements CommandLineRunner{
	
	@Autowired
    private UserRepository userRepository;
	
	public static void main(String[] args)  {
		SpringApplication.run(TestRmsApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Date date1=new Date("12/12/2012");
		User u1=new User(1L, "nour", "guerfali", "aaaa", "aaaa", "aaa", 1111111, date1, 12345678, "photo", "c1");
		userRepository.save(u1);
		
	}


	
	
	
}
