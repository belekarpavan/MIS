package com.mis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProfileController {

	@RequestMapping(value="student/profile", method= RequestMethod.GET)
	public String studentProfilePage() {
		return "student/profile";
	}
}
