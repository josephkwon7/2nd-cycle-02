package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	private int count = 0;
	
	@GetMapping("/helloworld")
	public String welcome() {
		count++;
		System.out.println("Welcome Controller !! " + count);
		return "welcome";
	}
}
