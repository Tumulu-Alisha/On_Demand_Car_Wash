package com.carwash.service.washer_service.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.service.washer_service.model.Washer;
import com.carwash.service.washer_service.repository.WasherRepository;

@RequestMapping("/api/washer")
@RestController
public class WasherController {
	
	@Autowired
	private WasherRepository washerRepository;
	
	@PostMapping("/addWasher")
	@ResponseStatus(HttpStatus.CREATED)
	public String saveWasher(@RequestBody Washer washer) {
		
		washerRepository.save(washer);
		return "Added a Washer"+ washer.getId();
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Washer> getDetail(){
		
		return washerRepository.findAll();		
	}
	
	@GetMapping("/findAll/{id}")
	public Optional<Washer> getDetail(@PathVariable int id) {
		return washerRepository.findById(id);
	}
	
	public String deleteWasher(@PathVariable int id) {
		washerRepository.deleteById(id);
		return "Washer with id: " +id + "got deleted";
	}
}
