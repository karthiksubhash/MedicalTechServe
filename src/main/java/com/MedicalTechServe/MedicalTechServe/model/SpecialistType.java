package com.MedicalTechServe.MedicalTechServe.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SpecialistType {
	
	@Id
    @GeneratedValue
	private Long type_id;
	

	@Column
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//@ManyToMany(mappedBy = "SpecialistType")
	//private List<Doctor> doctors;

//	public List<Doctor> getDoctors() {
//		return doctors;
//	}
//
//	public void setDoctors(List<Doctor> doctors) {
//		this.doctors = doctors;
//	}

	public SpecialistType(Long type_id, String type) {
		super();
		this.type_id = type_id;
		this.type = type;
	}
	

	public SpecialistType(String type){
		this.type = type;
	}
	
	public SpecialistType() {
		
	}
	

	public Long getType_id() {
		return type_id;
	}

	public void setType_id(Long type_id) {
		this.type_id = type_id;
	}
	
	

}
