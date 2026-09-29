package com.akshita.TouristWebApp.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.akshita.TouristWebApp.model.Tourist;


//here we are using controller only and not rest controller b/c this controller is not using rest apis
//we are not sending json data to client, we are sending obj data only to client in model, 
//and that object is being understood by thymeleaf which is showing data on UI

//put, patch and del are giving issue, may be due to thymeleaf connectivity or rest template ,need to check

//@Controller	//commented it out to use other controller - webFlux
public class TouristUIController {
	
	@Autowired
	RestTemplate restTemp;
	private final String BASE_URL = "http://localhost:8080/tourists";
	
	//we should not do all this thing in controller, we should pass the data to service layer make api calls there, get data from service layer and return to client
	//but for now just for understanding, let's do it here only
	
	@GetMapping("/tourists/{id}")
	public String getTourist(@PathVariable("id") Integer id, Model m) {
		String url = BASE_URL + "/get-tourist/" + id;
		Tourist t = restTemp.getForObject(url, Tourist.class);
		m.addAttribute("tourist", t);
		return "show-tourist";
	}
	
	@GetMapping("/tourists")
	public String allTourists(Model m) {
		
		String url = BASE_URL + "/get-tourists";
		Tourist[] t = restTemp.getForObject(url, Tourist[].class);
		List<Tourist> tourists = Arrays.asList(t);
		
		m.addAttribute("tourists", tourists);
		return "all-tourists";
	}
	
	@PostMapping("/add-tourist")
	public String addTourist(@ModelAttribute Tourist t, Model m) {
		String url = BASE_URL + "/reg-tourist";
		String resp = restTemp.postForObject(url, t, String.class);
		m.addAttribute("msg", resp); //we are adding resp msg here to model, but is not being displayed anywhere b/c we are redirecting to all-tourist page from here
		return "redirect:/tourists";
	}
	
	@PutMapping("/update-tourist")
//	public String updateTourist(@ModelAttribute Tourist t) {
	public String updateTourist(@RequestBody Tourist t) { //we use @RequestBody in rest api's b/c in rest api json data is coming from client, 
		//then why are we using @RequestBody here, b/c in thymeleaf we are sending json data while updating tourist hence
		String url = BASE_URL + "/update-tourist";
		restTemp.put(url, t);
		return "redirect:/tourists";
	}
	
	@PatchMapping("/udpate-budget/{id}/{newBudget}")
	public String udpateBudget(@PathVariable("id") Integer id, 
			@PathVariable("newBudget") Double nBudget) {
		
		//we are not using Model here b/c in thymeleaf page we are not sending data via model, we are sending it in json
		
		String url = BASE_URL + "/udpate-tourist-budget/" + id + "/" + nBudget;
		String resp = restTemp.patchForObject(url, null, String.class);
		
		return "redirect:/tourists";
	}
	
	@DeleteMapping("/delete-tourists/{id}")
	public String deleteTourist(@PathVariable("id") Integer id) {
		String url = BASE_URL + "/delete-tourist/" + id;
		restTemp.delete(url);
		return "redirect:/tourists";
	}
	
}
