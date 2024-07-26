package hn.unah.lenguajes.crud.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hn.unah.lenguajes.crud.models.Alumno;
import hn.unah.lenguajes.crud.services.AlumnosService;


@RestController
@RequestMapping("/api/alumnos")
public class AlumnosController {

    @Autowired
    private AlumnosService servicioAlumnos;

    @GetMapping("/todos")
    public List<Alumno> obtenerTodos() {
        return this.servicioAlumnos.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Alumno buscarPorId(@PathVariable(name="id") long id){
        return this.servicioAlumnos.obtenerPorId(id);
    }

    @DeleteMapping("/eliminar")
    public String eliminarAlumno(@RequestParam long id){
        return this.servicioAlumnos.eliminarAlumno(id);
    }
    
    @PostMapping("/agregar")
    public Alumno agregarAlumno(@RequestBody Alumno nvoAlumno){
        return this.servicioAlumnos.agregarAlumno(nvoAlumno);
    }

    @PutMapping("/editar/{id}")
    public String editarAlumno(@PathVariable long id, @RequestBody Alumno nvoAlumno){
        return  this.servicioAlumnos.editarAlumno(id,nvoAlumno);
    }
}
