import java.io.FileOutputStream;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) {

        try (FileOutputStream out = new FileOutputStream("test.txt")) {
            out.write("Hello World!".getBytes());
            out.flush();
        } catch (IOException e) {
            System.out.println("IoException 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}