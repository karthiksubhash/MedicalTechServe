package com.MedicalTechServe.MedicalTechServe.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {
	
	@Id
    @GeneratedValue
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String age;
	
	@Column
	private String gender;
	
//    @ManyToMany(cascade= CascadeType.ALL)
//    @JoinTable(
//    		  name = "Doctor_Specialization", 
//    		  joinColumns = @JoinColumn(name = "type_id"), 
//    		  inverseJoinColumns = @JoinColumn(name = "id"))
//    private List<SpecialistType> SpecialistType = new ArrayList<>();
	
	@Column
	private String SpecialistType; 
    
    
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getSpecialistType() {
		return SpecialistType;
	}


	public void setSpecialistType(String specialistType) {
		SpecialistType = specialistType;
	}


	public Doctor(Long id, String name, String age, String gender,
			String specialistType) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.SpecialistType = specialistType;
	}
	
	public Doctor( String name, String age, String gender,
			String specialistType) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.SpecialistType = specialistType;
	}

	public Doctor() {
		
	}

	
}
