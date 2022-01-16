package com.MedicalTechServe.MedicalTechServe.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	
	
	@Id
    @GeneratedValue
	private Long id;
	
	
	@Column
	private String name;
	

//    @ManyToMany(cascade= CascadeType.ALL)
//    @JoinTable(
//    		  name = "Visited_Doctor", 
//    		  joinColumns = @JoinColumn(name = "p_id"), 
//    		  inverseJoinColumns = @JoinColumn(name = "doc_id"))
	
	//should do M
	@Column
	private Long visitedDoctor;
    
    
	@Column
	private Date dateofVisit;


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


	public Long getVisitedDoctor() {
		return visitedDoctor;
	}


	public void setVisitedDoctor(Long visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}


	public Date getDateofVisit() {
		return dateofVisit;
	}


	public void setDateofVisit(Date dateofVisit) {
		this.dateofVisit = dateofVisit;
	}


	public Patient(Long id, String name, Long visitedDoctor, Date dateofVisit) {
		super();
		this.id = id;
		this.name = name;
		this.visitedDoctor = visitedDoctor;
		this.dateofVisit = dateofVisit;
	}
	
	
	public Patient( String name, Long visitedDoctor, Date dateofVisit) {
		super();
		this.name = name;
		this.visitedDoctor = visitedDoctor;
		this.dateofVisit = dateofVisit;
	}
	

	public Patient() {
		
	}
	
	
	
	

}
