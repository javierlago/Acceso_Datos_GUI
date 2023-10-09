/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Reibax
 */
public class Container implements Serializable {

    public Container() {

    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public void setListaModulos(ArrayList<Modulo> listaModulos) {
        this.listaModulos = listaModulos;
    }

    ArrayList<Alumno> listaAlumnos = new ArrayList();
    ArrayList<Modulo> listaModulos = new ArrayList();

    public ArrayList<Alumno> getStudentsList() {
        return listaAlumnos;
    }

    public ArrayList<Modulo> getSubjectsList() {
        return listaModulos;
    }

    public void addModulo(Modulo modulo) {
        listaModulos.add(modulo);
    }

    public void addAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);

    }

}
