package logic;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import logic.Modulo;
/**
 *
 * @author a22javierla
 */
public class FileCreator {
    
    
    
        static String directoryPath="src/main/java/files/";
    
    
        public static File createJsontFile(String fileName) throws IOException {
        File fileJson= new File(directoryPath + fileName +".json");
        if(!fileJson.exists())fileJson.createNewFile();
        return fileJson;
        }
 
    public static void crearListadoAlumnos(ArrayList<Alumno> listadoAlumnos)throws IOException,FileNotFoundException{
        Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
        try (FileWriter writer = new FileWriter(createJsontFile("Alumnos"))) {
            gson.toJson(listadoAlumnos, writer);
           gson.toJson(listadoAlumnos);

        }catch(FileNotFoundException e){
            System.err.println(e.getMessage());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
        
          public static void crearListadoModulos(ArrayList<Modulo> listadoModulos)throws IOException,FileNotFoundException{
        Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
        try (FileWriter writer = new FileWriter(createJsontFile("ListadoModulos"))) {
            gson.toJson(listadoModulos, writer);
           gson.toJson(listadoModulos);

        }catch(FileNotFoundException e){
            System.err.println(e.getMessage());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
        
        
        
        
        
        
        
        
        
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

