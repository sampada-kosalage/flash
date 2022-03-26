package org.study.spring;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Controller1 {

@RequestMapping(value="/",method=RequestMethod.GET)
public String welcome() {
	return "hello";
}

@RequestMapping("displayName")
public String displayName(HttpServletRequest request) {
	String firstName=request.getParameter("firstName");
	request.setAttribute(firstName, firstName);
	return "displyName";
}
	
}
