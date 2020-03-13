package unac.edu.co;


import unac.edu.co.Exception.InsertDiferentTypeException;
import unac.edu.co.Exception.InsufficientNoteException;

public class Alumno {
    private int idAlumno;
    private  String nombre;
    private  String apellido;
    private  int idEstudiante;
    private double nota;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, String apellido, int idEstudiante,double nota) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido=apellido;
        this.idEstudiante = idEstudiante;
        this.nota= nota;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public void comprobarRangoNotas(Double nota) throws InsufficientNoteException {
        if(nota >=0){
            System.out.println("Nota aceptada");
        }else{
            throw new InsufficientNoteException("el valor de la nota es mas elevado que el establecido por la institucion");
        }
    }
    public boolean isInteger() throws InsertDiferentTypeException {
        try{
            Integer.parseInt(String.valueOf(nota));
            return true;
        }catch(NumberFormatException e){
            throw  new InsertDiferentTypeException("el valor no puede ser cambiando");
        }
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno=" + idAlumno +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", idEstudiante=" + idEstudiante +
                ", nota=" + nota +
                '}';
    }


}