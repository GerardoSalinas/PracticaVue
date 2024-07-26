package hn.unah.lenguajes.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.crud.models.Alumno;

public interface AlumnosRepository extends JpaRepository<Alumno,Long> {

    public Alumno ID(long ID);

}
