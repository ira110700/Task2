import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import static java.nio.file.Files.lines;

public class NewFiles {

    public static void input() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа декодирования");
        System.out.println("Кодирование -z, декодирование -u");
        System.out.println("Введите команду");
        String flag = sc.next();
        System.out.println(flag);
        if (flag.equals("-z")) {
            System.out.println("Вы выбрали кодирование");
            rewriteCode();
            System.out.println("Ваш файл успешно закодирован");
        } else if (flag.equals("-u")) {
            System.out.println("Вы выбради декодирование");
            rewriteDecode();
            System.out.println("Ваш файл успешно декодирован");
        } else {
            System.out.println("Ошибка ввода команды");
        }
    }

    public static String readFile() throws IOException {
        String fileName = "task.txt";
        String content = lines(Paths.get(fileName)).reduce("", String::concat);
        return content;
    }

    public static void rewriteCode() {
        try {
            FileWriter writer1 = new FileWriter("task1.txt");
            String text1 = Rle.rleCode(readFile());
            writer1.write(text1);
            writer1.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void rewriteDecode() { // запись декодированного текста

        try {
            FileWriter writer2 = new FileWriter("task2.txt", false);
            String text = Rle.rleDecode(readFile());
            writer2.write(text);
            writer2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}



