package com.MedicalTechServe.MedicalTechServe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MedicalTechServe.MedicalTechServe.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Long>{

}
