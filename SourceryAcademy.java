import java.nio.file.Files;
import java.nio.file.Paths;

public class SourceryAcademy {
    public static void main(String[] args) {

        // Create a regex expression, which scans each string for two consecutive
        // 1-9 and 0-9 digits.
        String regex = ".*[1-9]{1}[0-9]{1}.*";

        String filePath = "JavaSampleCodes/src/text.txt";

        // Reads lines from a .txt file, which has a path defined as filePath,
        // iterates over the rows of the file and filters out all of the strings
        // that do not match the given reegex constraints. Prints the remaining ones.
        try {
            Files.lines(Paths.get(filePath))
            .filter(row -> row.matches(regex))
            .forEach(row -> System.out.println(row));      
        } catch (Exception e) {
            System.out.println("File could not be read: " + e.getMessage());
        }

    }
}
