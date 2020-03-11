package unac.edu.co;

import unac.edu.co.Exception.InsufficientNoteException;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private int IdMateria;
    private String nombreMateria;

    public Materia() {
        //List<Materia> asignatura = new ArrayList<Materia>();


    }

    public Materia(int idMateria, String nombreMateria) {
        IdMateria = idMateria;
        this.nombreMateria = nombreMateria;
    }

    public int getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(int idMateria) {
        IdMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }





    @Override
    public String toString() {
        return "\nID Materia: " + IdMateria + " \nNombre: " + nombreMateria ;
    }
}
