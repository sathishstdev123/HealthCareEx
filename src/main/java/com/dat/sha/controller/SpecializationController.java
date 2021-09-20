package com.dat.sha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dat.sha.Entity.Specialization;
import com.dat.sha.Service.ISpecializationService;

@Controller
@RequestMapping("/spec")
public class SpecializationController {
	
	@Autowired
	private ISpecializationService service;
	
	@GetMapping("/all")
	public String viewAll(@ModelAttribute Specialization spec,Model model) {
		 List<Specialization> list = service.getAllSpec();
		 model.addAttribute("spec",list);
		 return "SpecializationData";
		
	}

}
