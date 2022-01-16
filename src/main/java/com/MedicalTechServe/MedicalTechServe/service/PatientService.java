package com.MedicalTechServe.MedicalTechServe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicalTechServe.MedicalTechServe.model.Patient;
import com.MedicalTechServe.MedicalTechServe.repository.PatientRePository;

@Service
public class PatientService {
	
	
	@Autowired
	PatientRePository patientRePository;
	
	public Patient getPatientByID(Long id) {
		
		return patientRePository.findById(id).get();
	}
	
	public Patient createPatient(Patient p) {
		
		return patientRePository.save(p);
	}
}
