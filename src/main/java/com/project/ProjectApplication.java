package com.project;

import Intefaces.FakeRepo;
import Service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;

import javax.servlet.Filter;

@EnableCaching
@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectApplication.class, args);
		FakeRepo fakeRepo = new FakeRepo();
		System.out.println(fakeRepo.insertUser(1,"wes ","paul"));
		System.out.println(fakeRepo.findUserById(1));
		System.out.println(fakeRepo.deleteUser(1));
		UserServiceImpl userServiceImpl = new UserServiceImpl(fakeRepo);
		System.out.println(userServiceImpl.getUser(1));
		System.out.println(new WebSecurityConfigurer<>() {
			@Override
			public void init(SecurityBuilder<Filter> builder) throws Exception {

			}

			@Override
			public void configure(SecurityBuilder<Filter> builder) throws Exception {

			}
		});


	}

}
