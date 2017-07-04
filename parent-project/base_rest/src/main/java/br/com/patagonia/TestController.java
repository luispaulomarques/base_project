package br.com.patagonia;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/test")
public class TestController {

	
	@RequestMapping("/hello")
	public String testGet() {
		return "hello world modafuck";
	}
	
}
