package com.project;

import Models.User;
import Service.UserService;
import Service.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import javax.sound.sampled.Port;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProjectApplicationTests<assertThat> {
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

			@Override
			public String User(long id) {
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

			@Override
			public String User(long id) {
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

			@Override
			public String User(long id) {
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

			@Override
			public String User(long id) {
				return null;
			}
		}.getUser(4)));

	}
	@Autowired
	private TestRestTemplate template;

	ResponseEntity<String> response = template.withBasicAuth(?).getForEntity(?)

}