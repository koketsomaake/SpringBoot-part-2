package com.project;

import Controller.UserController;

import Service.UserService;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.security.config.annotation.web.WebSecurityConfigurer;



import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("ALL")
@SpringBootTest
class ProjectApplicationTests<assertThat> {
	private WebSecurityConfigurer webSecurityConfigurer;

	@Test
	void contextLoads() {
	}

	@Test
	void getUserTest() throws InterruptedException {

		assertThat(Boolean.parseBoolean(new UserService() {
			@Override
			public void addUser(long id, String name, String surname) {

			}

			@Override
			public void removeUser(long id) {

			}

			@Override
			public String getUser(long id) throws InterruptedException {
				System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
				Thread.sleep(1000 * 5);

				return null;
			}


		}.getUser(1)));


		assertThat(Boolean.parseBoolean(new UserService() {
			@Override
			public void addUser(long id, String name, String surname) {

			}

			@Override
			public void removeUser(long id) {

			}

			@Override
			public String getUser(long id) throws InterruptedException {

				System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
				Thread.sleep(1000 * 5);
				return null;
			}


		}.getUser(2)));

		assertThat(Boolean.parseBoolean(new UserService() {
			@Override
			public void addUser(long id, String name, String surname) {

			}

			@Override
			public void removeUser(long id) {

			}

			@Override
			public String getUser(long id) throws InterruptedException {

				System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
				Thread.sleep(1000 * 5);
				return null;
			}


		}.getUser(3)));

		assertThat(Boolean.parseBoolean(new UserService() {
			@Override
			public void addUser(long id, String name, String surname) {

			}

			@Override
			public void removeUser(long id) {

			}

			@Override
			public String getUser(long id) throws InterruptedException {
				System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
				Thread.sleep(1000 * 5);

				return null;
			}

		}.getUser(4)));

	}
	@Test
	public void SecurityConfigurerTest(){
		assertThat(Boolean.parseBoolean(String.valueOf(webSecurityConfigurer)));
	}
	
}
