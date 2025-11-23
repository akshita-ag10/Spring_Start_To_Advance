package com.akshita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {
	
	//when user will click on the button on this page, it will take to books page
	@GetMapping("/home")
	public String home(Model model) {
		return "index";
	}

	@GetMapping("/books")
	public  String bookInfo(Model model) {
		//we are doing some business logic here, but it should be done in service layer
		String[] books = new String[] {"Number Series", "Alphabet Series", "Missing Character"}; 
		model.addAttribute("listOfBooks", books);
		//to print all the books on webpage we have to do he similar thing on jsp page as shown below
//		for(String b: books) {
//			System.out.println(b);
//		}
		return "allbooks";
	}
}
