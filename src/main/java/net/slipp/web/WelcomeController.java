package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/helloworld")
	public String welcome() {
		System.out.println("Welcome Controller !!");
		System.out.println("Welcome Controller !!");
		System.out.println("Welcome Controller !!");
		System.out.println("Welcome Controller !!");
		return "welcome";
	}
}
