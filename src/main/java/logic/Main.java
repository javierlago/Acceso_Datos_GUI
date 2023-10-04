/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import Windows.MainWindow;


/**
 *
 * @author Reibax
 */
public class Main {
    public static void main(String[] args) {
        
        
        
        MenuPrincipal mp = new MenuPrincipal();
        mp.addModulo(new Modulo("Acceso a datos",120,10));
        mp.addModulo(new Modulo("Diseño de interfaces",100,9));
        System.out.println(mp.getListaModulos());
                
        
        MainWindow mw = new MainWindow(mp.getListaModulos(),mp.getListaAlumnos());
        mw.setVisible(true);
        System.out.println(mp.getListaAlumnos().toString());
        
    }
    
}
