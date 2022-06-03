package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myapp.entity.MyappEntity;
import com.myapp.service.impl.MyappServiceImpl;

@Controller
public class MyappController {
	
	private MyappServiceImpl myappServiceImpl;
	
	
	
	public MyappController(MyappServiceImpl myappServiceImpl) {
		super();
		this.myappServiceImpl = myappServiceImpl;
	}

	@GetMapping(value="/")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loginform");
		return mv;
	}
	
	@PostMapping(value="/loginform")
	public ModelAndView loginform(@RequestParam("username")String name,@RequestParam("password")String pass) {
		ModelAndView mv = new ModelAndView();
		boolean isvalid = myappServiceImpl.isvalidlogin(name, pass);
		if(!isvalid) {
			mv.setViewName("loginform");
			mv.addObject("errormsg", "Invalid Login Credentials!!!");
			return mv;
		}
		return new ModelAndView("redirect:/studentform");
	}
	
	@GetMapping(value="/studentform")
	public ModelAndView studentform(@ModelAttribute("myapp")MyappEntity myappEntity) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentform");
		return mv;
	}
	
	@PostMapping(value="/studentsubmit")
	public ModelAndView studentsubmit(@ModelAttribute("myapp")MyappEntity myappEntity) {
		myappServiceImpl.create(myappEntity);
		return new ModelAndView("redirect:/displaydata");
	}
	
	@GetMapping(value="/displaydata")
	public ModelAndView displaydata() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displaydata");
		mv.addObject("myapplist", myappServiceImpl.read());
		return mv;
	}
	
	@GetMapping(value="/update")
	public ModelAndView update(@RequestParam long id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studentform");
		mv.addObject("myapp", myappServiceImpl.update(id));
		return mv;
	}
	
	@PostMapping(value="/updatedata")
	public ModelAndView updatesubmit(@RequestParam long id,@ModelAttribute("myapp")MyappEntity myappEntity) {
		myappServiceImpl.create(myappEntity);
		return new ModelAndView("redirect:/displaydata");
	}
	
	@GetMapping(value="/delete")
	public ModelAndView delete(@RequestParam long id) {
		myappServiceImpl.delete(id);
		return new ModelAndView("redirect:/displaydata");
		
	}
}
