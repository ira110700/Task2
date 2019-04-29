import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

import static java.nio.file.Files.lines;

public class NewFiles {
    public static void createFile() {
        try {
            FileWriter writer1 = new FileWriter("task.txt");
            String text = "ABCABCABCDDDFFFFFF";
            writer1.write(text);
            writer1.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static String readFile() throws IOException{
        String fileName = "task.txt";
        String content = lines(Paths.get(fileName)).reduce("", String::concat);
        return content;
    }

}
