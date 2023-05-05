package com.BcSoft.ih.testfinale.service;

import java.util.List;

import com.BcSoft.ih.testfinale.model.Articolo;

public interface ArticoloService {

	
	List<Articolo> getAllArticoli();
	
	void saveArticolo(Articolo articolo); 

	Articolo getArticoloById(String id);
	
	void deleteArticolobyId(String id);
}


