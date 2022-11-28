import java.util.Properties;
import java.util.Set;


// Properties作为Map集合的使用
public class PropertiesDemo01 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("avad", "124");
        prop.put("dada", "124");

        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value =prop.get(key);
            System.out.println(key+","+value);
        }
    }

}
