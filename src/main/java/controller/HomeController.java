package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String greeting() {
		return "<h2>Running spring boot service in docker..hello</h2>";
	}

}
