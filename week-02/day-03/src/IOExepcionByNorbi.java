import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOExepcionByNorbi {
    public static void main(String[] args) {
        String fileName = "filename.txt";
        Path path = Paths.get(fileName);
         try {
             List<String> content = Files.readAllLines(path);
             int sum = 0;
             for (int i = 1; i < content.size(); i++) {
                 System.out.println(content.get(i));
                 //String[] tomb = content.get(i).split(";");
                 System.out.println(content.get(i).split(";")[4]);
                 sum += Integer.valueOf(content.get(i).split(";")[4]);
             }
             System.out.println(sum);
             } catch (IOException e) {
             System.out.println("there was an IO exception");
             } catch (Exception e) {
             System.out.println("there was an exception");
             }
         finally {
             System.out.println("appears for sure");
             }
            ArrayList<String> output = new ArrayList<>();
            output.add("kiscica");
            output.add("kiskutya");

            try {
                Files.write(path, output);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}