package com.demo.repositories;

import com.demo.entities.Alumno;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends BaseRepository <Alumno, Long>{
}
