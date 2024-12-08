import java.io.FileWriter;
import java.io.IOException;

public class Java_TryWithResources {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("test.txt")){
            writer.write("Hello Java");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }  // finally 코드에서 FileWriter close 처리를 해주어야 하지만 Writer객체가 Closeable 인터페이스를 구현하고 있기 때문에 try~catch를 통해 자동으로 close 처리가 됨
    }

}
