package com.nt.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class MsgController {

	
	@GetMapping("/")
	public String Msg() {
		return "WelCome To Rest API";
	}
}
