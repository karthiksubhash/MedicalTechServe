package com.MedicalTechServe.MedicalTechServe.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MedicalTechServe.MedicalTechServe.model.Doctor;
import com.MedicalTechServe.MedicalTechServe.model.Patient;
import com.MedicalTechServe.MedicalTechServe.model.SpecialistType;
import com.MedicalTechServe.MedicalTechServe.service.DoctorService;
import com.MedicalTechServe.MedicalTechServe.service.PatientService;

@RestController
public class MedicalTechServeController {

	@Autowired
	DoctorService doctorService;
	
	@Autowired
	PatientService patientService;
	
	@GetMapping("/patient/{patientid}")
	public Patient getPatientById(@PathVariable("patientid") Long id) {
		return patientService.getPatientByID(id);
	}
	
	
	@GetMapping("/testPatientDetails")
	public Patient createPatientDetails() {

		Doctor doc= doctorService.getDoctor(Long.valueOf(1));
		
		Patient p = new Patient("p_test",doc.getId(),new Date());
	
		return patientService.createPatient(p);

	}

	@GetMapping("/createTestDoc")
	public Doctor createTestDoctor() {

//		SpecialistType spType = new SpecialistType("Nuro");
//		List<SpecialistType> SpTypeList = new ArrayList<>();
//		SpTypeList.add(spType);
		
		
		Doctor doc = new Doctor("test_NAme", "34", "M", "neuron");

		return doctorService.createDoctor(doc);

	}

	@GetMapping("/doctor/{doctorid}")
	private Doctor getDoctor(@PathVariable("doctorid") Long id) {
		return doctorService.getDoctor(id);
	}

	@GetMapping("/doctor/")
	private List<Doctor> getALLDoctor() {
		return doctorService.getAllDoctor();
	}

	@PostMapping("/doctor")
	private Doctor createDoctor(@RequestBody Doctor doc) {
		return doctorService.createDoctor(doc);
	}

	
	@GetMapping("/doctorVistedCount//{doctorid}")
	private int doctorVistedCount(@PathVariable("doctorid") Long id) {
		
		return doctorService.getDocCount(id);	
	}
	
	
}
