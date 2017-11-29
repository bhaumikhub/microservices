/**
 * 
 */
package com.dev.bootsecurity.BootLogin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author dark knight
 *
 */
@Entity
public class Role {
	
	@Id
	@GeneratedValue
	private Long id;
	String name;
	
	public Role(){}
	
	public Role(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
