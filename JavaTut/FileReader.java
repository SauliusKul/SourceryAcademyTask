package JavaTut;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private List<String> rowList;

    public FileReader() {
        rowList = new ArrayList<String>();
    }
    
    public List<String> getRowList() {
        return rowList;
    }

    public void readText(String textFile) {        
        try {
            Files.lines(Paths.get(textFile))
            .forEach(row -> rowList.add(row));      
        } catch (Exception e) {
            System.out.println("File could not be read: " + e.getMessage());
        }
    } 
}
