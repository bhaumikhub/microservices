package com.dev.bootsecurity.BootLogin;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.dev.bootsecurity.BootLogin.entity.Role;
import com.dev.bootsecurity.BootLogin.entity.User;
import com.dev.bootsecurity.BootLogin.repo.UserRepo;

@SpringBootApplication
public class BootLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootLoginApplication.class, args);
	}

	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepo repo) throws Exception {
		// builder.userDetailsService(new UserDetailsService() {
		//
		// @Override
		// public UserDetails loadUserByUsername(String username) throws
		// UsernameNotFoundException {
		// // TODO Auto-generated method stub
		// return new CustomUserDetails(repo.findByUserName(username));
		// }
		// });

		if (repo.count() == 0) {
			repo.save(new User("user", "user", Arrays.asList(new Role("USER"), new Role("ADMIN"))));
		}

		// With Lambda
		builder.userDetailsService(s -> new CustomUserDetails(repo.findByUserName(s)));

	}
}
