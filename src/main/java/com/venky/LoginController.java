package com.venky;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public String home(Model m)
	{
		Users user= new Users();
		m.addAttribute("user",user); 
		return "login";
	}
	@RequestMapping(value="/req1",method=RequestMethod.POST)
	public String printDetails(@ModelAttribute User user,Model m)
	{
		m.addAttribute("user",user);
		return "result";
	}
}
