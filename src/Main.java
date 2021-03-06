import unac.edu.co.Alumno;
import unac.edu.co.Exception.InsertDiferentTypeException;
import unac.edu.co.Exception.InsufficientNoteException;
import unac.edu.co.Materia;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Materia> asignatura = new ArrayList<Materia>();
        List<Alumno> estudiante = new ArrayList<Alumno>();
        Materia listaMateria = new Materia();

        Materia m1 = new Materia(01,"POO II");
        asignatura.add(m1);
        Materia m2 = new Materia(02, "Estructura de Datos");
        asignatura.add(m2);
        Materia m3 = new Materia(03, "Cosmovision");
        asignatura.add(m3);

        Scanner seleccion = new Scanner(System.in);
        String respuesta;
        int i = 1;
        do {
            System.out.println("Registro de Alumnos \n");
            System.out.println("1. Agregar materia");
            System.out.println("2. Consultar materia");
            System.out.println("3. Agregar alumno");
            System.out.println("4. Ver historial");
            System.out.println("5. Salir");

            respuesta = seleccion.next();
            switch (respuesta) {
                case "1":
                    /*System.out.println("Nombre de la Materia");
                    String nombreMateria = seleccion.next();
                    Materia a = new Materia(i, nombreMateria);
                    asignatura.add(a);
                    i++;
                    respuesta = "0";*/
                    break;
                case "2":
                    /*System.out.println("Introduce la id de la materia a consultar");
                    int idm = seleccion.nextInt();
                    if (asignatura.size() < idm) {
                        System.out.println("La materia " + asignatura.get(i).getNombreMateria() + " se encuentra registrada");
                    } else {
                        System.out.println(asignatura.get(idm - 1));
                    }
                    respuesta = "0";*/
                    break;
                case "3":
                    System.out.println("Ingrese nombre");
                    String nombre = seleccion.next();
                    System.out.println("Ingrese apellido");
                    String apellido = seleccion.next();
                    System.out.println("ingrese identificacion");
                    int idEstudiante = seleccion.nextInt();
                    System.out.println("ingrese Materia a escoger");
                    for (int j = 0; j < asignatura.size(); j++) {
                        System.out.println("Nombre de la Materia "+ j+ " " + asignatura.get(j).getNombreMateria() );
                    }
                    int j = seleccion.nextInt();
                    System.out.println("Nota de la Materia " + asignatura.get(j).getNombreMateria());
                    Double nota = seleccion.nextDouble();
                    Alumno es = new Alumno(i,nombre,apellido,idEstudiante,nota);
                    estudiante.add(es);
                    i++;
                    try {
                        es.isInteger();
                        es.comprobarRangoNotas(nota);
                    } catch (InsufficientNoteException ex) {
                        System.out.println("Invalid Operation Exception");
                        System.out.println(ex.getMessage());
                    } catch (InsertDiferentTypeException ex) {
                        System.out.println("Por favor, coloca una nota entre el rango de 0-5");
                    } finally {
                        System.out.println();
                    }
                    respuesta = "0";
                    break;
                case "4":
                    System.out.println("Datos del alumno: \n" +estudiante + estudiante.toString() );
                    respuesta = "0";
                    break;
                case "5":
                    System.out.println("adios");
                    respuesta = "1";
                    break;
                default:
                    System.out.println("Opción invalida. Debes elegir 1,2 ó 3");
                    respuesta = "0";

            }

        } while (respuesta == "0");

    }
}

