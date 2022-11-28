import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesGame {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("game.txt");
        prop.load(fr);
        fr.close();
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);
        if (number >= 3) {
            System.out.println("试玩结束");

        } else {
            // guessnumber.start();//实现一个猜数字游戏
            number++;
            prop.setProperty("count", String.valueOf(number));
            FileWriter fw = new FileWriter("game.txt");
            prop.store(fw, null);
            fw.close();
        }
    }
}
