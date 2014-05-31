package com.synapse.futbolitosocial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value="message/{msgId}", method=RequestMethod.POST)
	@ResponseBody
	public String homeMessage(@PathVariable String msgId) {
		return "HOLA-PALOOZA";
	}
	
}
