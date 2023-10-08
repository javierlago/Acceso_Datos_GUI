package logic;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author a22javierla
 */
public class FileCreator {
    
    
    
        static String directoryPath="src/main/java/Files/";
    
    
        public static File createJsontFile(String fileName) throws IOException {
        File fileJson= new File(directoryPath + fileName +".json");
        if(!fileJson.exists())fileJson.createNewFile();
        return fileJson;
        }
 
    public static void crearListadoAlumnos(ArrayList<Alumno> listadoAlumnos)throws IOException,FileNotFoundException{
        Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
        try (FileWriter writer = new FileWriter(createJsontFile("ListadoAlumnos"))) {
            gson.toJson(listadoAlumnos, writer);
           gson.toJson(listadoAlumnos);

        }catch(FileNotFoundException e){
            System.err.println(e.getMessage());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
        
          public static void crearListadoModulos(ArrayList<Modulo> listado)throws IOException,FileNotFoundException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(createJsontFile("ListadoModulos"))) {
            gson.toJson(listado, writer);
          

        }catch(FileNotFoundException e){
            System.err.println(e.getMessage());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
        
        
          public static ArrayList fileStudentsReaderFromJson(ArrayList<Alumno> listadoAcopiar){
         String fileName = "src/main/java/Files/ListadoAlumnos.json";
        Gson gson = new Gson();

        try {
            // Abre el archivo JSON con FileReader
            FileReader fileReader = new FileReader(fileName);

            // Utiliza Gson para deserializar el JSON en un objeto
            MenuPrincipal listadoAlumnos = gson.fromJson(fileReader, MenuPrincipal.class);
            listadoAcopiar = listadoAlumnos.getListaAlumnos();

            // Cierra el FileReader
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
          }
        
        
        
        return listadoAcopiar;
        
    }
          public static ArrayList fileReaderSubjectFromJson(){
         String fileName = "src/main/java/Files/ListadoModulos.json";
        Gson gson = new Gson();
        ArrayList<Modulo> listado = new ArrayList();
        
        try {
            // Abre el archivo JSON con FileReader
            FileReader fileReader = new FileReader(fileName);
            java.lang.reflect.Type tipoLista = new TypeToken<ArrayList<Modulo>>() {}.getType();
            listado = gson.fromJson(fileReader,tipoLista);
            
            // Cierra el FileReader
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
          }
        
        
        
        return listado;
        
    }



}   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

