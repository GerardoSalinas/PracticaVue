package hn.unah.lenguajes.crud.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.unah.lenguajes.crud.models.Alumno;

import hn.unah.lenguajes.crud.repositories.AlumnosRepository;

@Service
public class AlumnosService {

    @Autowired
    private AlumnosRepository alumnosRepository; 

    public List<Alumno> obtenerTodos(){
        return this.alumnosRepository.findAll();
    }

    public Alumno obtenerPorId(long id){
        Alumno result = this.alumnosRepository.ID(id);
        return (!result.equals(null)) ? result:null;
    }

    public String eliminarAlumno(long ID){
        if (this.alumnosRepository.existsById(ID)){
            this.alumnosRepository.deleteById(ID);
            return "El alumno con ID: " + ID + " ha sido eliminado";
        }
        return "No existe el alumno con ID: " + ID ;
    }

    public Alumno agregarAlumno(Alumno nvoAlumno){
        if (!this.alumnosRepository.existsById(nvoAlumno.getID())){
            this.alumnosRepository.save(nvoAlumno);
            return nvoAlumno;
        }
        return null;
    }


    public String editarAlumno(long id, Alumno nvoAlumno){
        if (this.alumnosRepository.existsById(id)){
            Alumno antiguoAlumno = this.alumnosRepository.findById(id).get();
            antiguoAlumno.setPrimerNombre(nvoAlumno.getPrimerNombre());
            antiguoAlumno.setSegundoNombre(nvoAlumno.getSegundoNombre());
            antiguoAlumno.setPrimerApellido(nvoAlumno.getPrimerApellido());
            antiguoAlumno.setSegundoApellido(nvoAlumno.getSegundoApellido());
            antiguoAlumno.setCorreo(nvoAlumno.getCorreo());
            antiguoAlumno.setNumeroCuenta(nvoAlumno.getNumeroCuenta());
            antiguoAlumno.setTelefono(nvoAlumno.getTelefono());
            antiguoAlumno.setCarrera(nvoAlumno.getCarrera());
            this.alumnosRepository.save(antiguoAlumno);
            return "Alumno " + antiguoAlumno.getPrimerNombre() + " " 
            + antiguoAlumno.getPrimerApellido() + " actualizado con exito";
        }
        return "No se pudo Actualizar el registro del Alumno";
    }
}
