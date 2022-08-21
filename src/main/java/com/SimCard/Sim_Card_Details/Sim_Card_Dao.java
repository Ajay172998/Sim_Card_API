package com.SimCard.Sim_Card_Details;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Sim_Card_Dao extends JpaRepository<Sim_Card_Details, Integer> {

	
	@Query(value="select u.* from Sim_Card_Details u WHERE u.Expiry_Date>=current_date+interval 29 day and u.Expiry_Date<=current_date+interval 31 day",nativeQuery = true)
	public List<Sim_Card_Details> getAllSimCard();
}
