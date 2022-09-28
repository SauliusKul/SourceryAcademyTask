package JavaTut;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        FileReader reader = new FileReader();
        reader.readText("JavaSampleCodes/src/JavaTut/text.txt");
        List<String> rowList = reader.getRowList();

        String reg = ".*[1-9]{1}[0-9]{1}.*";
        
        rowList.stream()
        .filter(row -> row.matches(reg))
        .forEach(row -> System.out.println(row));
    }
}
