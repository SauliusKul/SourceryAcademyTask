package JavaTutorial;

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

    // Reads lines from a .txt file, which has a path defined as filePath,
    // and insert the lines into an instance array list
    public void readText(String filePath) {

        try {
            Files.lines(Paths.get(filePath))
            .forEach(row -> rowList.add(row));      
        } catch (Exception e) {
            System.out.println("File could not be read: " + e.getMessage());
        }
    } 
}
