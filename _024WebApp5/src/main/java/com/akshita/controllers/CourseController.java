package com.akshita.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.akshita.model.Course;

@Controller
public class CourseController {

	@GetMapping("/quant-course")
	public String Course(Model model) {
		Course qc = new Course(22, "Quantitative Reasoning", "A training program designed to improve mathematical and analytical skills", 4999.0);
		model.addAttribute("course", qc);
		return "quantitativeCourse";
	}
}
