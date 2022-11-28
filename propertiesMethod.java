
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class propertiesMethod {

    /*
     * Properties和流操作的特有方法:
     * void store(Writer writer, String comments)
     * void load(Reader reader)
     */
    public static void main(String[] args) throws IOException {
        // testStore();
        testLoad();
    }

    // Properties属性集保存数据到文件: void store​(Writer writer, String comments)
    public static void testStore() throws IOException {
        // 创建属性对象
        Properties ps = new Properties();
        ps.setProperty("username", "admin");
        ps.setProperty("password", "123456");

        // 创建文件的字符输入流
        FileWriter fw = new FileWriter("day_11/files/config.properties");

        // 调用方法存储
        ps.store(fw, "用户名和密码");

        // 关闭流
        fw.close();
    }

    // 加载文件中数据到Properties属性集中: void load​(Reader reader)
    public static void testLoad() throws IOException {
        // 创建接收对象
        Properties pro = new Properties();

        // 创建文件输出流
        FileReader fr = new FileReader("day_11/files/config.properties");

        // 调用方法输出数据
        pro.load(fr);
        System.out.println(pro);

        // 关闭流
        fr.close();
    }
}
