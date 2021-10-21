package com.SpringoMongoAPI;

import models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repository.UserRepository;

@SpringBootApplication
public class SpringoMongoApiApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringoMongoApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserModel userModel1 = new UserModel("Carlos Roberto", "01551974010");
		UserModel userModel2 = new UserModel("João Henrique", "01551974011");
		UserModel userModel3 = new UserModel("Adhemar João", "01551974012");
		UserModel userModel4 = new UserModel("regina Helena", "01551974013");
	}
}
