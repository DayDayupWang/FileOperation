import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//对象序列化流
public class objectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream foo = new ObjectOutputStream(new FileOutputStream("D:\\a.txt"));
        Student fo = new Student();

        foo.writeObject(fo);
        foo.close();

    }
}
