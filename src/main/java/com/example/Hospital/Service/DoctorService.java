package com.example.Hospital.Service;
import java.util.List;

import com.example.Hospital.Model.DoctorModel;

public interface DoctorService {
    
    public List<DoctorModel> findAll(); 

    public DoctorModel save(DoctorModel doctorModel);

    public DoctorModel findById(Integer id);

    public void delete(Integer id);
}
