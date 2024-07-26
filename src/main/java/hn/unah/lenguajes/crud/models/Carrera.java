package hn.unah.lenguajes.crud.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="Carrera")
@Data
public class Carrera {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private String nombre;
}
