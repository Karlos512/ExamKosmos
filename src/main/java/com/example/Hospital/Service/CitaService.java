package com.example.Hospital.Service;
import java.util.List;

import com.example.Hospital.Model.CitaModel;


public interface CitaService {
    
    public List<CitaModel> findAll(); 

    public CitaModel save(CitaModel citaModel);

    public CitaModel findById(Integer id);

    public void delete(Integer id);
}
