package com.example.empleadoservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = false, nullable = false)
    private Long id;

    private String rutEmpleado;
    private String apellidos;
    private String nombres;
    private Date fechaIngreso;
    private String categoria;
    private Date fechaNacimiento;
}