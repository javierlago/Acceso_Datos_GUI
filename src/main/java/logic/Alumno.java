
package logic;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Reibax
 */
public class Alumno implements Serializable{

    public Alumno(String nombre, String localidad,ArrayList<Modulo> modulosStudent) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.modulosStudent = modulosStudent;
    }
  
    String nombre,localidad;
    
    public ArrayList<Modulo> getModulosStudent() {
        return modulosStudent;
    }
   
    ArrayList<Modulo> modulosStudent;

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
    modulosStudent.add(moduloA);
    }
    
    public String[] getModulosName(){
    String[] nombreModulos = new String[modulosStudent.size()];
    
        for (int i=0;i<nombreModulos.length;i++){
            nombreModulos[i]=modulosStudent.get(i).getNombre();
        }
        
     return nombreModulos;
    }
    public double getNumberHours(){
    double horasAcumuladas=0;
    if(!modulosStudent.isEmpty()){
        for (Modulo h : modulosStudent) {
            horasAcumuladas += (double)h.getHoras();
        }
    }
    return horasAcumuladas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", localidad=" + localidad + ", modulosStudent=" + modulosStudent + '}';
    }
    
    
    
    
    
}
