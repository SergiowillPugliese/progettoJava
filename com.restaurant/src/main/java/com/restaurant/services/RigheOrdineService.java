package com.restaurant.services;

import com.restaurant.entities.RigheOrdineEntity;
import com.restaurant.repositories.RigheOrdineRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(path="/righeOrdine") 
public class RigheOrdineService {
	
	@Resource
	private RigheOrdineRepository righeOrdineRepository;
	
	@GetMapping
	public List<RigheOrdineEntity> getOrdines(){
		return righeOrdineRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public RigheOrdineEntity updateRigheOrdine(@PathVariable Integer id) {
		return righeOrdineRepository.findById(id).get();
	}
	
	@PostMapping
	public RigheOrdineEntity saveRigheOrdine(@RequestBody RigheOrdineEntity righeOrdine) {
		return righeOrdineRepository.save(righeOrdine);
	}
	
	
	@DeleteMapping(path = "/{id}")
	public void deleteRigheOrdine(@PathVariable Integer id) {
		righeOrdineRepository.deleteById(id);
	}
}
