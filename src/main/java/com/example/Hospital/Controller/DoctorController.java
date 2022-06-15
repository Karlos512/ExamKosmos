package com.example.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hospital.Model.DoctorModel;
import com.example.Hospital.Service.DoctorService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/doctoresapi")
public class DoctorController {
    
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/Doctores")
    public List<DoctorModel> listarDoctores(){
        return doctorService.findAll();
    }

    @PostMapping("/doctor")
    public DoctorModel GuardarDoctor(@RequestBody DoctorModel doctor){
        return doctorService.save(doctor);
    }

    @GetMapping("/Doctores/{id}")
    public DoctorModel BuscarDoctor(@PathVariable Integer id){
        return doctorService.findById(id);
    }

    // @PutMapping("/doctor/{id}")
    // public DoctorModel ModificarDoctor(@RequestBody DoctorModel doctor, @PathVariable Integer id){
    //     DoctorModel doctorAct = doctorService.findById(id);
    //     doctorAct.setDoctor(doctor.getDoctor());
    //     return doctorService.save(doctorAct);
    // }

    @DeleteMapping("/doctor/{id}")
    public void EliminarDoctor(@PathVariable Integer id){
        doctorService.delete(id);
    }
    
}
