package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWordController {
        
	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public String seyHello(Model model){
		  model.addAttribute("message", "hello mvc");
		  return "welcome";
	  }
}
