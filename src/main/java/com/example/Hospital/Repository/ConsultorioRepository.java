package com.example.Hospital.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Hospital.Model.ConsultorioModel;

public interface ConsultorioRepository extends CrudRepository<ConsultorioModel, Integer> {
    
}
