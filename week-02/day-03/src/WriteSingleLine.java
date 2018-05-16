import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        ArrayList<String> output = new ArrayList<>();
        output.add("Markus");

        String fileName = "my-file.txt";
        Path path = Paths.get(fileName);
        try {
            Files.write(path, output);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}

