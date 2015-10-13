package com.frosty.musicroutine.controllers;

import java.util.Map;

import com.frosty.musicroutine.domain.Routine;
import com.frosty.musicroutine.service.RoutineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoutineController {
	
	@Autowired
	private RoutineService routineService;

	@RequestMapping("/index")
	public String listContacts(Map<String, Object> map) {

		map.put("routine", new Routine());
		map.put("routineList", routineService.listRoutine());

		return "routine";
	}
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("routine") Routine contact,
			BindingResult result) {

		routineService.addContact(contact);

		return "redirect:/index";
	}

	@RequestMapping("/delete/{contactId}")
	public String deleteContact(@PathVariable("contactId") Integer contactId) {

		routineService.removeRoutine(contactId);

		return "redirect:/index";
	}
	
	@RequestMapping(value = "/update/{routineId}", method = RequestMethod.GET)
	public String updateContactForm(Map<String, Object> map, @PathVariable("routineId") Integer routineId){
		Routine routine = new Routine();
		routine = routineService.getRoutine(routineId);
		map.put("routine", routine);
		return "update";
	}

}
