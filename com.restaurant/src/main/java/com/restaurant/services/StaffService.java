package com.restaurant.services;

import com.restaurant.entities.StaffEntity;
import com.restaurant.repositories.StaffRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(path="/staff") 
public class StaffService {
	
	@Resource
	private StaffRepository staffRepository;
	
	@GetMapping
	public List<StaffEntity> getStaffs(){
		return staffRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public StaffEntity updateStaff(@PathVariable Integer id) {
		return staffRepository.findById(id).get();
	}
	
	@PostMapping
	public StaffEntity saveStaff(@RequestBody StaffEntity staff) {
		return staffRepository.save(staff);
	}
	
	
	@DeleteMapping(path = "/{id}")
	public void deleteStaff(@PathVariable Integer id) {
		staffRepository.deleteById(id);
	}
}
