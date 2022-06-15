package com.example.Hospital.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cita")
public class CitaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "consultorio_id")
    private Integer consultorio_id;

    @Column(name = "doctor_id")
    private Integer doctor_id;

    @Column(name = "hora_consulta")
    private Date hora_consulta;
    
    @Column(name = "nombre_paciente")
    private String nombre_paciente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConsultorio_id() {
        return consultorio_id;
    }

    public void setConsultorio_id(Integer consultorio_id) {
        this.consultorio_id = consultorio_id;
    }

    public Integer getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Integer doctor_id) {
        this.doctor_id = doctor_id;
    }

    public Date getHora_consulta() {
        return hora_consulta;
    }

    public void setHora_consulta(Date hora_consulta) {
        this.hora_consulta = hora_consulta;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }
    
    
}
