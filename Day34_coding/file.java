import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class file 
{
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("object.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            String data = (String) in.readObject();
            System.out.println(data);
            in.close();
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}