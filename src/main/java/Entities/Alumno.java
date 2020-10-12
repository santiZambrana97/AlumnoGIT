package Entities;

import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
@Audited
@Builder
@NoArgsConstructor

public class Alumno {

    @Column(name = "legajo")
    private int legajo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "curso")
    private String curso;
}
