package com.example.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Hospital.Model.CitaModel;
import com.example.Hospital.Repository.CitaRepository;

@Service
public class CitaServiceImplements implements CitaService{
    @Autowired
    private CitaRepository citaRepository;

    @Override
    @Transactional(readOnly=true)
    public List<CitaModel> findAll(){
        return (List<CitaModel>) citaRepository.findAll();
    }

    @Override
    @Transactional(readOnly=false)
    public CitaModel save(CitaModel cita){
        return citaRepository.save(cita);
    }

    @Override
    @Transactional(readOnly=true)
    public CitaModel findById(Integer id){
        return citaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        citaRepository.deleteById(id);
    }
}
