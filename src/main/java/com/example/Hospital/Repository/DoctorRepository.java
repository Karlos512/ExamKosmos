package com.example.Hospital.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Hospital.Model.DoctorModel;

public interface DoctorRepository extends CrudRepository<DoctorModel, Integer>{
    
}
