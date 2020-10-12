package com.demo.services;

import com.demo.entities.Alumno;
import com.demo.repositories.AlumnoRepository;
import com.demo.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl extends BaseServiceImpl<Alumno, Long> implements AlumnoService{
    @Autowired
    private AlumnoRepository personaRepository;

    public AlumnoServiceImpl(BaseRepository<Alumno, Long> baseRepository){
        super(baseRepository);
    }
}
