package com.example.empleadoservice.service;

import com.example.empleadoservice.entity.EmpleadoEntity;
import com.example.empleadoservice.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public ArrayList<EmpleadoEntity> obtenerEmpleados(){
        return (ArrayList<EmpleadoEntity>) empleadoRepository.findAll();
    }

    public EmpleadoEntity guardarEmpleado(EmpleadoEntity empleado){
        return empleadoRepository.save(empleado);
    }

}