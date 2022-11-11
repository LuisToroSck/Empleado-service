package com.example.empleadoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empleadoservice.entity.EmpleadoEntity;
import com.example.empleadoservice.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping
    public ResponseEntity<List<EmpleadoEntity>> getEmpleados() {
        return ResponseEntity.ok(empleadoService.obtenerEmpleados());
    }

    @PostMapping()
    public ResponseEntity<EmpleadoEntity> save(@RequestBody EmpleadoEntity empleado){
        EmpleadoEntity empleadoNew = empleadoService.guardarEmpleado(empleado);
        return ResponseEntity.ok(empleadoNew);
    }
}
