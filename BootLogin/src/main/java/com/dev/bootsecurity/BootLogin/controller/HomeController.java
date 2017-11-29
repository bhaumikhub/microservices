/**
 * 
 */
package com.dev.bootsecurity.BootLogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dark knight
 *
 */
@RestController
public class HomeController {

	@GetMapping(value = "/")
	public String home() {
		return "Hello";
	}

	@GetMapping(value = "/private")
	public String privateArea() {
		return "Privacy";
	}

}
