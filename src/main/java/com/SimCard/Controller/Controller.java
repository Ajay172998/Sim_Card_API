package com.SimCard.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SimCard.Constant.Constants;
import com.SimCard.Sim_Card_Details.Sim_Card_Details;
import com.SimCard.Sim_Card_Details.Sim_Card_Services;



@RestController
@RequestMapping("/")     
public class Controller {
    
	@Autowired
	Sim_Card_Services sim_card_service;
	
	//1. To Add Sim_Card in DB
	@PostMapping("/add")
	ResponseEntity<?> addSimCard(@RequestBody Sim_Card_Details simCard)
	{
		
		Sim_Card_Details sim = simCard;
//		Integer id = customerService.saveCustomer(user);
		Integer id =sim_card_service.addSim_Card(sim);

		return new ResponseEntity <>(Constants.SIMCARD_ADDED +": "+id,HttpStatus.ACCEPTED);
	}
	
	
	//2.To List of Sim_Card in DB
	@GetMapping("/listall")
	ResponseEntity<List<Sim_Card_Details>> getAllSimCard()
	{
		
       List<Sim_Card_Details> allSimCard = new ArrayList<>();
       
       allSimCard = sim_card_service.listofSim();

		return new ResponseEntity(allSimCard,HttpStatus.OK);
		
	}
	
	
	//3.To Delete by Id
	@DeleteMapping("/delete/{id}")
	public ResponseEntity deleteSim(@PathVariable int id){
		
		
		sim_card_service.deleteSimCard(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
	
	
	//4.To Update by Id let say update telecomm_provider
	@PutMapping("/update/{id}")
	public void updateById(@PathVariable int id) {
		sim_card_service.updateSimCard(id);
 
	}
	
	
	//5. To-renew API SimCard which is expired in next 30 days
	@GetMapping("/to-renew")
	ResponseEntity<List<Sim_Card_Details>> getSimCardForRenew(){
		List<Sim_Card_Details> renewSimCard = new ArrayList<>();
	       
		renewSimCard = sim_card_service.getAllSimCardForRenew();
			return new ResponseEntity(renewSimCard,HttpStatus.OK);
	}
	
	
}
