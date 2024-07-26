package hn.unah.lenguajes.crud.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Alumnos")
@Data
public class Alumno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(name="primernombre")
    private String primerNombre;

    @Column(name="segundonombre")
    private String segundoNombre;
    
    @Column(name="primerapellido")
    private String primerApellido;

    @Column(name="segundoapellido")
    private String segundoApellido;
    
    @Column(name="numerocuenta")
    private String numeroCuenta;

    @Column(name="telefono")
    private String telefono;

    @Column(name="correo")
    private String correo;
    
    @Column(name="carrera")
    private String carrera;

}
