package com.restaurant.services;

import com.restaurant.entities.OrdineEntity;
import com.restaurant.repositories.OrdineRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(path="/ordine") 
public class OrdineService {
	
	@Resource
	private OrdineRepository ordineRepository;
	
	@GetMapping
	public List<OrdineEntity> getOrdines(){
		return ordineRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public OrdineEntity updateOrdine(@PathVariable Integer id) {
		return ordineRepository.findById(id).get();
	}
	
	@PostMapping
	public OrdineEntity saveOrdine(@RequestBody OrdineEntity ordine) {
		return ordineRepository.save(ordine);
	}
	
	
	@DeleteMapping(path = "/{id}")
	public void deleteOrdine(@PathVariable Integer id) {
		ordineRepository.deleteById(id);
	}
}
