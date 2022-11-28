import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * objectInputStreamDemo
 */
public class objectInputStreamDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\a.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());
        ois.close();
    }
}