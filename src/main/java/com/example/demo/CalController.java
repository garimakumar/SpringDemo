package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CalController {


	                              // We will be changing the datatype from String to ModelAndView datatype and 
	                              //the ResponseBody will be removed when using datatype ModelAndView

	@RequestMapping("/")       
public ModelAndView loadfrontpage(jakarta.servlet.http.HttpServletRequest request,jakarta.servlet.http.HttpServletResponse response) {
ModelAndView mv=new ModelAndView();
mv.setViewName("index");
return mv;
	}
	
	@RequestMapping("/add")       
public ModelAndView add(jakarta.servlet.http.HttpServletRequest request,jakarta.servlet.http.HttpServletResponse response) {
ModelAndView mv=new ModelAndView();
int result=Integer.parseInt(request.getParameter("no.1"))+Integer.parseInt(request.getParameter("no.2"));
mv.setViewName("display");
mv.addObject("result",result);	
	return mv;
	}

@ResponseBody                     //ResponseBody is used to get the response on the virtual page
    @RequestMapping("/sub")
public String sub(jakarta.servlet.http.HttpServletRequest request,jakarta.servlet.http.HttpServletResponse response) {
int result=Integer.parseInt(request.getParameter("no.1"))-Integer.parseInt(request.getParameter("no.2"));
return "the sub is" +result;
}

  }
