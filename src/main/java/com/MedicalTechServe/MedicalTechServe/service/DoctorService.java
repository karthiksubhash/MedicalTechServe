package com.MedicalTechServe.MedicalTechServe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicalTechServe.MedicalTechServe.model.Doctor;
import com.MedicalTechServe.MedicalTechServe.model.Patient;
import com.MedicalTechServe.MedicalTechServe.repository.DoctorRepository;
import com.MedicalTechServe.MedicalTechServe.repository.PatientRePository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	@Autowired
	private PatientRePository patientRePository;

	public Doctor getDoctor(Long id) {
		return doctorRepository.findById(id).get();
	}

	public Doctor createDoctor(Doctor doc) {

//		
//		Doctor doctor= 
//				new Doctor(doc.getId(),doc.getName(),
//						doc.getAge(),doc.getGender(),
//						doc.getSpecialistType());
//		
		doctorRepository.save(doc);
		return doc;

	}

	public List<Doctor> getAllDoctor() {
		return doctorRepository.findAll();
	}

	public int getDocCount(Long id) {
		
		List<Patient> p = patientRePository.findAll();
		
		int NumberDocVisted = (int) p.stream().filter(n -> n.getVisitedDoctor() == id).count();
		
		return NumberDocVisted;
	}

}
