/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author Reibax
 */
public class Alumno {

    public Alumno(String nombre, String localidad,ArrayList<Modulo> modulos) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.modulos = modulos;
    }
    
    String nombre,localidad;
    
    ArrayList<Modulo> modulos = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
    public void anadirModulo(Modulo moduloA){
    modulos.add(moduloA);
    }
    
    public String[] getModulosName(){
    String[] nombreModulos = new String[modulos.size()];
    
        for (int i=0;i<nombreModulos.length;i++){
            nombreModulos[i]=modulos.get(i).getNombre();
        }
        
     return nombreModulos;
    }
    public double getNumberHours(){
    double horasAcumuladas=0;
    
        for (Modulo h : modulos) {
            horasAcumuladas += (double)h.getHoras();
        }
    return horasAcumuladas;
    }
    
    
    
    
    
}
