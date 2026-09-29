package com.akshita.TouristWebApp.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.client.WebClient;

import com.akshita.TouristWebApp.model.Tourist;

//to use webflux, we need to use webflux dependancy

//all features are actually working but it is showing failed to user on updating or delting 
//but when reloaded it is actually updated or deleted
//so the backend apis are fine here in webclient controller, the issue with the thymeleaf page, in js, so leave it for now

@Controller
public class TouristUIControllerWebFlux {
	
	@Autowired
	private WebClient webClient;
	
		//we should not do all this thing in controller, we should pass the data to service layer make api calls there, get data from service layer and return to client
		//but for now just for understanding, let's do it here only
		
		@GetMapping("/tourists/{id}")
		public String getTourist(@PathVariable("id") Integer id, Model m) {
//			
			Tourist t = webClient.get()
			.uri("/get-tourist/" + id)
			.retrieve()
			.bodyToMono(Tourist.class)
			.block();
			
			m.addAttribute("tourist", t);
			return "show-tourist";
		}
		
		@GetMapping("/tourists")
		public String allTourists(Model m) {
					
			List<Tourist> tourists = webClient.get()
			.uri("/get-tourists")
			.retrieve()
			.bodyToFlux(Tourist.class)
			.collectList()
			.block();
			
			m.addAttribute("tourists", tourists);
			return "all-tourists";
		}
		
		@PostMapping("/add-tourist")
		public String addTourist(@ModelAttribute Tourist t, Model m) {
	
			String resp = webClient.post()
					.uri("/reg-tourist")
					.bodyValue(t)
					.retrieve()
					.bodyToMono(String.class)
					.block();
			
			m.addAttribute("msg", resp); //we are adding resp msg here to model, but is not being displayed anywhere b/c we are redirecting to all-tourist page from here
			return "redirect:/tourists";
		}
		
		@PutMapping("/update-tourist")
//		public String updateTourist(@ModelAttribute Tourist t) {
		public String updateTourist(@RequestBody Tourist t) { //we use @RequestBody in rest api's b/c in rest api json data is coming from client, 
			//then why are we using @RequestBody here, b/c in thymeleaf we are sending json data while updating tourist hence
			
//			String url = BASE_URL + "/update-tourist";
//			restTemp.put(url, t);
			
			webClient.put()
			.uri("/update-tourist")
			.bodyValue(t)
			.retrieve()
			.bodyToMono(String.class)
			.block();;
			return "redirect:/tourists";
		}
		
		@PatchMapping("/udpate-budget/{id}/{newBudget}")
		public String udpateBudget(@PathVariable("id") Integer id, 
				@PathVariable("newBudget") Double nBudget) {
			
			
//			String url = BASE_URL + "/udpate-tourist-budget/" + id + "/" + nBudget;
//			String resp = restTemp.patchForObject(url, null, String.class);
			
			String resp = webClient.patch()
			.uri("/udpate-tourist-budget/" + id + "/" + nBudget)
			.retrieve()
			.bodyToMono(String.class)
			.block();
			
			return "redirect:/tourists";
		}
		
		@DeleteMapping("/delete-tourists/{id}")
		public String deleteTourist(@PathVariable("id") Integer id) {
//			String url = BASE_URL + "/delete-tourist/" + id;
//			restTemp.delete(url);
			
			String resp = webClient.delete()
					.uri("/delete-tourist/" + id)
					.retrieve()
					.bodyToMono(String.class)
					.block();
			
			return "redirect:/tourists";
		}
	 

}
