package JavaTutorial;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Initialize a new FileReader and use the .readText method to read all lines from 
        // the specified text file
        FileReader reader = new FileReader();
        reader.readText("JavaSampleCodes/src/JavaTut/text.txt");
        List<String> rowList = reader.getRowList();

        // Create a regex expression, which scans each string for two consecutive
        // 1-9 and 0-9 digits.
        String reg = ".*[1-9]{1}[0-9]{1}.*";
        
        // Iterates over the ArrayList "rowList" and filters out all of the strings
        // that do not match the given constraints, and prints the remaining ones 
        rowList.stream()
        .filter(row -> row.matches(reg))
        .forEach(row -> System.out.println(row));
    }
}
