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
public class MenuPrincipal {

    public MenuPrincipal() {
        
        
    }
    
    
    ArrayList<Alumno> listaAlumnos = new ArrayList();
    ArrayList<Modulo> listaModulos = new ArrayList();

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public ArrayList<Modulo> getListaModulos() {
        return listaModulos;
    }

   public void addModulo(Modulo modulo){
       listaModulos.add(modulo);
    }
   
 
    
    
}
