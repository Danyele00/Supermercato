package com.BcSoft.ih.testfinale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BcSoft.ih.testfinale.model.Articolo;
import com.BcSoft.ih.testfinale.repository.ArticoloRepository;


@Service
public class ArticoloServiceImpl implements ArticoloService{
	
	@Autowired
	ArticoloRepository articoliRepository;

	@Override
	public List<Articolo> getAllArticoli() {
		return articoliRepository.findAll();
		
	}

	@Override
	public void saveArticolo(Articolo articolo) {
		this.articoliRepository.save(articolo);
		
	}

	@Override
	public Articolo getArticoloById(String id) {

		Optional<Articolo>optional=articoliRepository.findById(id);
		Articolo articolo=null;
		if (optional.isPresent()) {
			articolo=optional.get();
		}else {
			throw new RuntimeException("L'articolo con id "+id+" non è stato trovato");
		}
		return articolo;
	}

	@Override
	public void deleteArticolobyId(String id) {
		this.articoliRepository.deleteById(id);
		
	}

	

}
