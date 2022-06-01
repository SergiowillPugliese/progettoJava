package com.restaurant.services;

import com.restaurant.entities.OrdineEntity;
import com.restaurant.entities.RigheOrdineEntity;
import com.restaurant.repositories.OrdineRepository;
import com.restaurant.repositories.RigheOrdineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(path="/ordine") 
public class OrdineService {
	
	@Autowired
	private OrdineRepository ordineRepository;
	@Autowired
	private RigheOrdineRepository righeOrdineRepository;
	
	@GetMapping(value = "/getOrdine")
	public List<OrdineEntity> getOrdines(){
		return ordineRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public OrdineEntity updateOrdine(@PathVariable Integer id) {
		return ordineRepository.findById(id).get();
	}
	
	@PostMapping(value = "/saveOrdine")
	public RigheOrdineEntity saveOrdine(@RequestBody RigheOrdineEntity righeOrdine) {
		return righeOrdineRepository.save(righeOrdine);
	}
	
	
	@DeleteMapping(path = "/{id}")
	public void deleteOrdine(@PathVariable Integer id) {
		ordineRepository.deleteById(id);
	}
}
