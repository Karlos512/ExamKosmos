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

import com.example.Hospital.Model.CitaModel;
import com.example.Hospital.Service.CitaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/citasapi")
public class CitaController {
    @Autowired
    private CitaService citaService;

    @GetMapping("/Citas")
    public List<CitaModel> listarCitas(){
        return citaService.findAll();
    }

    @PostMapping("/cita")
    public CitaModel GuardarCita(@RequestBody CitaModel cita){
        return citaService.save(cita);
    }

    @GetMapping("/Citas/{id}")
    public CitaModel BuscarCita(@PathVariable Integer id){
        return citaService.findById(id);
    }

    @DeleteMapping("/cita/{id}")
    public void EliminarCita(@PathVariable Integer id){
        citaService.delete(id);
    }
}
