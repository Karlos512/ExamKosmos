package com.example.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Hospital.Model.DoctorModel;
import com.example.Hospital.Repository.DoctorRepository;

@Service
public class DoctorServiceImplements implements DoctorService{
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    @Transactional(readOnly=true)
    public List<DoctorModel> findAll(){
        return (List<DoctorModel>) doctorRepository.findAll();
    }

    @Override
    @Transactional(readOnly=false)
    public DoctorModel save(DoctorModel doctorModel){
        return doctorRepository.save(doctorModel);
    }

    @Override
    @Transactional(readOnly=true)
    public DoctorModel findById(Integer id){
        return doctorRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id){
        doctorRepository.deleteById(id);
    }
}
