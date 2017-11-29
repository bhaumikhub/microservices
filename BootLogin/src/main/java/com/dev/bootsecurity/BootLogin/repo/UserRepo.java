/**
 * 
 */
package com.dev.bootsecurity.BootLogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.bootsecurity.BootLogin.entity.User;

/**
 * @author dark knight
 *
 */
public interface UserRepo extends JpaRepository<User, Long> {

	User findByUserName(String userName);

}
