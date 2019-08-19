package com.mis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String indexPage() {
		return "base/index";
	}

	@RequestMapping(value="student",method=RequestMethod.GET)
	public String studentLoginPage() {
		return "student/login";
	}
	@RequestMapping(value="student/register",method=RequestMethod.GET)
	public String studentRegisterPage() {
		return "student/register";
	}
	
	@RequestMapping(value="teacher",method=RequestMethod.GET)
	public String teacherLoginPage() {
		return "teacher/login";
	}
	
	@RequestMapping(value="admin",method=RequestMethod.GET)
	public String adminLoginPage() {
		return "admin/login";
	}
	
	@RequestMapping(value="student/dashboard",method=RequestMethod.GET)
	public String dashboardPage() {
		return "student/dashboard";
	}
}
