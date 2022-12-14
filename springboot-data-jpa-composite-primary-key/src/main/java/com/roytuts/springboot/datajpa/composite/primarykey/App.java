package com.roytuts.springboot.datajpa.composite.primarykey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.roytuts.springboot.datajpa.composite.primarykey.entity.User;
import com.roytuts.springboot.datajpa.composite.primarykey.entity.UserPKey;
import com.roytuts.springboot.datajpa.composite.primarykey.repository.UserRepository;

@SpringBootApplication
@EntityScan(basePackages = "com.roytuts.springboot.datajpa.composite.primarykey.entity")
@EnableJpaRepositories(basePackages = "com.roytuts.springboot.datajpa.composite.primarykey.repository")
public class App implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args).close();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("=====================================================================");
		List<User> users = userRepository.findAll();
		users.stream().forEach(u -> System.out.println(u));
		System.out.println("---------------------------------------------------------------------");
		System.out.println();

		User user = userRepository.findByUserPKey(new UserPKey("Soumitra", "Roy"));
		System.out.println(user);
		System.out.println("---------------------------------------------------------------------");
		System.out.println();

		User newUser = new User();
		newUser.setId(4);
		newUser.setUserPKey(new UserPKey("First Name", "Last Name"));
		userRepository.save(newUser);

		users = userRepository.findAll();
		users.stream().forEach(u -> System.out.println(u));
		System.out.println("---------------------------------------------------------------------");
		System.out.println();

		newUser.setUserPKey(new UserPKey("First Name", "Last"));
		userRepository.save(newUser);
		
		users = userRepository.findAll();
		users.stream().forEach(u -> System.out.println(u));
		System.out.println("---------------------------------------------------------------------");
		System.out.println();

		userRepository.delete(newUser);

		users = userRepository.findAll();
		users.stream().forEach(u -> System.out.println(u));
		//System.out.println("---------------------------------------------------------------------");
		//System.out.println();
		System.out.println("=====================================================================");
	}

}
