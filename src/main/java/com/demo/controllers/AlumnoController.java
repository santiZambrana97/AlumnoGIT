package com.demo.controllers;

import com.demo.entities.Alumno;
import com.demo.services.AlumnoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="tpa/alumnos")
public class AlumnoController extends BaseControllerImpl<Alumno, AlumnoServiceImpl>{
}
