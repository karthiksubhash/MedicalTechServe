package com.MedicalTechServe.MedicalTechServe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MedicalTechServe.MedicalTechServe.model.Patient;

public interface PatientRePository extends JpaRepository<Patient,Long> {

}
