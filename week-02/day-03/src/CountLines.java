import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        String fileName = "FileManipulation.iml";
        System.out.println(countLines(fileName));
    }

    public static int countLines(String fileName) {
        int lineNumber = 0;
        try {
            Path filePath = Paths.get("FileManipulation.iml");
            List<String> lines = Files.readAllLines(filePath);
            for (String s : lines) {
                lineNumber += 1;
            }
        } catch (Exception e) {

        }
        return lineNumber;
    }
}