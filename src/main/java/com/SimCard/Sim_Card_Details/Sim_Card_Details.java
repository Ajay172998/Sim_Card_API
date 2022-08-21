package com.SimCard.Sim_Card_Details;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="Sim_Card_Details")
public class Sim_Card_Details {

//	Sim_Card_no
//	Mobile_no
//	Status
//	Expiry_Date
//	State_of_Registration
//	KYC
//	Telecom_Provider
//	Full_Name
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer Sim_Card_no;
	
	@Column(name="Mobile_No")
	Long Mobile_no;
	
	@Column(name="Status")
	String Status;
	
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="Expiry_Date")
	Date Expiry_Date;
	
	@Column(name="State_of_Registration")
	String State_of_Registration;
	
	@Column(name="KYC")
	String KYC;
	
	@Column(name="Telecom_Provider")
	String Telecom_Provider;
	
	@Column(name="Full_Name")
	String Full_Name;

	
	public Integer getSim_Card_no() {
		return Sim_Card_no;
	}


	public void setSim_Card_no(Integer sim_Card_no) {
		Sim_Card_no = sim_Card_no;
	}


	public Long getMobile_no() {
		return Mobile_no;
	}


	public void setMobile_no(Long mobile_no) {
		Mobile_no = mobile_no;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public Date getExpiry_Date() {
		return Expiry_Date;
	}


	public void setExpiry_Date(Date expiry_Date) {
		Expiry_Date = expiry_Date;
	}


	public String getState_of_Registration() {
		return State_of_Registration;
	}


	public void setState_of_Registration(String state_of_Registration) {
		State_of_Registration = state_of_Registration;
	}


	public String getKYC() {
		return KYC;
	}


	public void setKYC(String kYC) {
		KYC = kYC;
	}


	public String getTelecom_Provider() {
		return Telecom_Provider;
	}


	public void setTelecom_Provider(String telecom_Provider) {
		Telecom_Provider = telecom_Provider;
	}


	public String getFull_Name() {
		return Full_Name;
	}


	public void setFull_Name(String full_Name) {
		Full_Name = full_Name;
	}


	public Sim_Card_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
}
