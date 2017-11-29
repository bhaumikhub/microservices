/**
 * 
 */
package com.dev.bootsecurity.BootLogin.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author dark knight
 *
 */
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	private String userName;
	private String password;
	@OneToMany(fetch= FetchType.EAGER, cascade=	CascadeType.ALL)
	private List<Role> roles;
	
	public User() {}
	
	public User(String userName, String password, List<Role> roles){
		// Do Nothing
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the roles
	 */
	public List<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	


	
	
}
