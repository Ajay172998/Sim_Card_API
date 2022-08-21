package com.SimCard.Sim_Card_Details;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Sim_Card_Services {

	@Autowired
	Sim_Card_Dao sim_card_dao;
	
	//1.Add SimCard
	public Integer addSim_Card(Sim_Card_Details sim) {
		
		Sim_Card_Details addedSim=sim_card_dao.save(sim);
		return addedSim.getSim_Card_no();
	}
	
	//2.List all SimCard
	public List<Sim_Card_Details> listofSim(){
		List<Sim_Card_Details>listofSim=new ArrayList<Sim_Card_Details>();
		
		listofSim=sim_card_dao.findAll();
		return listofSim;
	}
	

	//3.update by Id //void
	public void updateSimCard(int sim_no) {
		String change_telecom_provider="Airtel";
		
		Sim_Card_Details sm=sim_card_dao.getReferenceById(sim_no);
	
		//System.out.println(sm.getFull_Name());
		sm.setTelecom_Provider(change_telecom_provider);
		
		sim_card_dao.save(sm);
	
	}
	//4.Delete by Id
	public void deleteSimCard(int sim_no) {
		
		
		sim_card_dao.deleteById(sim_no);

		
	}
	
	//5.to-renew API SimCard which is expired in next 30 days
	public List<Sim_Card_Details> getAllSimCardForRenew(){
		List<Sim_Card_Details> sm=sim_card_dao.getAllSimCard();
		return sm;
	}
		
}
