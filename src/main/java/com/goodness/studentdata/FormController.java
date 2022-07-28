package com.goodness.studentdata;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping ("/")
	public String studentFile(){
		return "studentFile.jsp";
	}
	

}
