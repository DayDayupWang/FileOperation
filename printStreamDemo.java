import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class printStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("D:\\a.txt");
        ps.print(97);
        ps.println(98);
        ps.close();

        PrintWriter pw = new PrintWriter("D:\\a.txt");
        pw.write("hello");
        // 数据不能直接进入需要刷新一下
        pw.flush();
        pw.close();
        // 设置自动刷新 ！！推荐方法
        PrintWriter pautoFlush = new PrintWriter(new FileWriter("D:\\a.txt"), true);
        pautoFlush.println("hello");
        pautoFlush.close();
    }
}
