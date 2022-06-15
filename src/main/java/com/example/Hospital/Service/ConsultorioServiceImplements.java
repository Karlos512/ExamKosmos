package com.example.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Hospital.Model.ConsultorioModel;
import com.example.Hospital.Repository.ConsultorioRepository;

@Service
public class ConsultorioServiceImplements implements ConsultorioService{
    @Autowired
    private ConsultorioRepository consultorioRepository;

    @Override
    @Transactional(readOnly=true)
    public List<ConsultorioModel> findAll(){
        return (List<ConsultorioModel>) consultorioRepository.findAll();
    }

    @Override
    @Transactional(readOnly=false)
    public ConsultorioModel save(ConsultorioModel consultorio){
        return consultorioRepository.save(consultorio);
    }

    @Override
    @Transactional(readOnly=true)
    public ConsultorioModel findById(Integer id){
        return consultorioRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        consultorioRepository.deleteById(id);
    }
}
