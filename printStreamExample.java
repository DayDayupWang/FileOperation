import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//复制文件并改进简化
public class printStreamExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\a.txt"), true);

        String line;
        while ((line = br.readLine()) != null) {
            pw.println(line);

        }
        pw.close();
        br.close();
    }
}
