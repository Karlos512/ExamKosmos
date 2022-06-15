package com.example.Hospital.Service;
import java.util.List;

import com.example.Hospital.Model.ConsultorioModel;

public interface ConsultorioService {
    
    public List<ConsultorioModel> findAll();

    public ConsultorioModel save(ConsultorioModel consultorioModel);

    public ConsultorioModel findById(Integer id);

    public void delete(Integer id);
}
