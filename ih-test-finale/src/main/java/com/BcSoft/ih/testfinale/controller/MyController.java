package com.BcSoft.ih.testfinale.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BcSoft.ih.testfinale.model.Articolo;
import com.BcSoft.ih.testfinale.service.ArticoloService;



@Controller
public class MyController {

	@Autowired
	ArticoloService articoloService;
	
	
	@RequestMapping("/")
	public String homePage(Model model) {
		
		model.addAttribute("listaArticoli", articoloService.getAllArticoli());
		return"home.html";
	}
	
	@GetMapping("/cancellaArticolo/{id}")
	public String deleteArticolo(@PathVariable(value="id")String id, Model model) {
		
		this.articoloService.deleteArticolobyId(id);
		return "redirect:/"; 
	}
	
	@RequestMapping("/articoloForm")
	public String articoloForm(Model model) {
		Articolo articolo= new Articolo();
		model.addAttribute("articolo", articolo);
		return "form";
		
		
	}
	
	@PostMapping("/articoloSalvato")
	public String saveArticoloCOntroller(@ModelAttribute("articolo")Articolo articolo) {
		articoloService.saveArticolo(articolo);
		return "redirect:/"; 
	}
	

	@GetMapping("/aggiornaArticolo/{id}")
	public String updatePersone(@PathVariable(value = "id") String id,Model model) {
		
		Articolo articolo = articoloService.getArticoloById(id);
	
		model.addAttribute("articoli", articolo);
		return "update.html";
	}
	
	@InitBinder     
	public void initBinder(WebDataBinder binder){
	     binder.registerCustomEditor(       Date.class,     
	                         new CustomDateEditor(new SimpleDateFormat("dd/MM/yyyy"), true, 10));   
	}
	
}
