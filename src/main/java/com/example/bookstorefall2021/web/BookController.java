package com.example.bookstorefall2021.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String showIndex() {
		// GO TO PAGE HELLO.HTML
		return "index";
	}
}
