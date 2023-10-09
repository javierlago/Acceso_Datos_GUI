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
 * 
 */



public class FileCreator {

    static String directoryPath = "src/main/java/Files/";

    
  
    public static File createJsontFile(String fileName) throws IOException {
        File fileJson = new File(directoryPath + fileName + ".json");
        if (!fileJson.exists()) {
            fileJson.createNewFile();
        }
        return fileJson;
    }

    public static void createData(Container dataContainer) throws IOException, FileNotFoundException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(createJsontFile("Listados"))) {
            gson.toJson(dataContainer, writer);

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }





    public static Container recoverData() {
        String fileName = "src/main/java/Files/Listados.json";
        Gson gson = new Gson();
        Container container = new Container();
        try {
            FileReader filereader = new FileReader(fileName);
            container = gson.fromJson(filereader, Container.class);

        } catch (Exception e) {
        }

        return container;
    }

}
