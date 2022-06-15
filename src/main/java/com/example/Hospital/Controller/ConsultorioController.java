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

import com.example.Hospital.Model.ConsultorioModel;
import com.example.Hospital.Service.ConsultorioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/consultorioapi")

public class ConsultorioController {
    @Autowired
    private ConsultorioService consultorioService;

    @GetMapping("/Consultorios")
    public List<ConsultorioModel> listarConsultorios(){
        return consultorioService.findAll();
    }

    @PostMapping("/consultorio")
    public ConsultorioModel GuardarConsultorio(@RequestBody ConsultorioModel consultorio){
        return consultorioService.save(consultorio);
    }

    @GetMapping("/Consultorios/{id}")
    public ConsultorioModel BuscarConsultorio(@PathVariable Integer id){
        return consultorioService.findById(id);
    }

    @DeleteMapping("/consultorio/{id}")
    public void EliminarConsultorio(@PathVariable Integer id){
        consultorioService.delete(id);
    }
}
