package unac.edu.co;


public class Alumno {
    private int idAlumno;
    private  String nombre;
    private  int idEstudiante;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, int idEstudiante) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
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

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno=" + idAlumno +
                ", nombre='" + nombre + '\'' +
                ", idEstudiante=" + idEstudiante +
                '}';
    }
}