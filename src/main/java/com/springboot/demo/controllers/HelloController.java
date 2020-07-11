package com.springboot.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.demo.enitity.Person;

@EnableAutoConfiguration
@Controller
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/home")
	public String home(ModelMap model) {
		String title = "Home Page | Spring Boot WebApplication";
		model.addAttribute("title", title);
		return "home";
	}

	@GetMapping("/person")
	public String person(ModelMap model) {
		String title = "Person Page | Spring Boot WebApplication";
		String hello = "Hello Person: ";
		model.addAttribute("title", title);
		model.addAttribute("hello", hello);

		// add model
		Person person = new Person("Sutin", "Injitt", 30, "CPU", "2551");
		model.addAttribute("person", person);
		return "person";
	}

	@GetMapping("/persons")
	public String persons(Model model) {
		Map<String, String> persons = new HashMap<String, String>();
		persons.put("firstName", "sutin");
		persons.put("lastName", "injitt");

		model.addAttribute("entries", persons);
		return "persons";
	}

}
