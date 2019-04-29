import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        NewFiles.createFile();
        System.out.println(NewFiles.readFile());
        System.out.println(Rle.rleCode(NewFiles.readFile()));  // 1A1B1C1A1B1C1A1B1C3D6F
        System.out.println(Rle.rleDecode("A1 B1 C1 A1 B1 C1 A1 B1 C1 D3 F6"));
    }
}



