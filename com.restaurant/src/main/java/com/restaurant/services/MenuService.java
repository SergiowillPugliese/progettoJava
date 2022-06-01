package com.restaurant.services;

import com.restaurant.entities.MenuEntity;
import com.restaurant.repositories.MenuRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(path="/menu") 
public class MenuService {
	
	@Resource
	private MenuRepository menuRepository;
	
	@GetMapping(value = "getMenu")
	public List<MenuEntity> getMenus(){
		return menuRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public MenuEntity updateMenu(@PathVariable Integer id) {
		return menuRepository.findById(id).get();
	}
	
	@PostMapping(value = "saveMenu")
	public MenuEntity saveMenu(@RequestBody MenuEntity menu) {
		return menuRepository.save(menu);
	}
	
	
	@DeleteMapping(path = "/{id}")
	public void deleteMenu(@PathVariable Integer id) {
		menuRepository.deleteById(id);
	}
}
