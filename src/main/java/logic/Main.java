package logic;

import GUI.MainWindow;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Reibax
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Container container = new Container();
//        container.addModulo(new Modulo("Acceso a datos",120,10));
//        container.addModulo(new Modulo("Diseño de interfaces",100,9));
//        container.addModulo(new Modulo("Entornos  de desarrollo",80,9));
//        container.addModulo(new Modulo("Formacion y orientacion laboral",70,9));
//        Modulo a = new Modulo("Acceso a datos", 120, 10);
//        Modulo b = new Modulo("Diseño de interfaces", 100, 9);
//        Modulo c = new Modulo("Entornos  de desarrollo",80,9);
//        Modulo d = new Modulo("Formacion y orientacion laboral",70,9);
//        ArrayList<Modulo> dosMod = new ArrayList();
//        dosMod.add(a);
//        dosMod.add(b);
//        ArrayList<Modulo> tresMod = new ArrayList();
//        tresMod.add(a);
//        tresMod.add(b);
//        tresMod.add(c);
//        ArrayList<Modulo> cuatroMod = new ArrayList();
//        cuatroMod.add(a);
//        cuatroMod.add(b);
//        cuatroMod.add(c);
//        cuatroMod.add(d);
//        container.addAlumno(new Alumno("Javier", "Vigo",dosMod));
//        container.addAlumno(new Alumno("Manuel", "Fornelos",tresMod));
//        container.addAlumno(new Alumno("Fernando", "Fornelos",cuatroMod));
//        
//        FileCreator.createDatabase(container);
        
        
        
        
        
        
//        FileCreator.crearListadoModulos(mp.getListaModulos());

        MainWindow mw;
        mw = new MainWindow(container.getListaModulos(), container.getListaAlumnos());
        mw.setVisible(true);
        System.out.println(container.getListaAlumnos().toString() + container.listaModulos.toString());

    }

}
